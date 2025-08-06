import { useEffect, useRef, useState } from 'react'

function App() {
  const [result, setResult] = useState('')
  const [file, setFile] = useState('')
  const [code, setCode] = useState<string[]>([''])
  const [selectedLine, setSelectedLine] = useState(0)
  const inputRefs = useRef<HTMLInputElement[]>([])
  const fileInputRef = useRef<HTMLInputElement | null>(null)
  const debounceTimer = useRef<null | number>(null)

  const handleIconClick = () => {
    fileInputRef.current?.click()
  }

  const handleSaveClick = () => {
    // Guardar archivo .ru
    const ruBlob = new Blob([code.join('\n')], { type: 'text/plain' })
    const ruFileName = file && file.endsWith('.ru') ? file : 'codigo.ru'
    const ruA = document.createElement('a')
    ruA.href = URL.createObjectURL(ruBlob)
    ruA.download = ruFileName
    document.body.appendChild(ruA)
    ruA.click()

    setTimeout(() => {
      document.body.removeChild(ruA)
      URL.revokeObjectURL(ruA.href)
    }, 0)

    // Guardar archivo de salida
    const outFileName = (ruFileName.replace(/\.ru$/, '') || 'codigo') + '.out.txt'
    const outBlob = new Blob([result], { type: 'text/plain' })
    const outA = document.createElement('a')
    outA.href = URL.createObjectURL(outBlob)
    outA.download = outFileName
    document.body.appendChild(outA)
    outA.click()

    setTimeout(() => {
      document.body.removeChild(outA)
      URL.revokeObjectURL(outA.href)
    }, 0)
  }

  const handleFileChange = async (event: React.ChangeEvent<HTMLInputElement>) => {
    const fileObj = event.target.files?.[0]
    if (!fileObj) return
    if (!fileObj.name.endsWith('.ru')) {
      alert('Solo se permiten archivos .ru')
      return
    }
    const text = await fileObj.text()
    setFile(fileObj.name)
    const lines = text.replace(/\r\n?/g, '\n').split('\n')
    setCode(lines.length ? lines : [''])
    setSelectedLine(0)

    if (debounceTimer.current) clearTimeout(debounceTimer.current)
    const finalCode = (lines.length ? lines : ['']).join('\n')
    await fetchData(finalCode)
  }

  const fetchData = async (code: string) => {
    const response = await fetch('http://localhost:8000/traducir', {
      method: 'POST',
      headers: {
        'Content-Type': 'text/plain'
      },
      body: code
    })

    const data = await response.text()
    setResult(data)
  }

  const handleKeyDown = (event: React.KeyboardEvent<HTMLInputElement>) => {
    if (event.key === 'Enter') {
      event.preventDefault()
      const input = event.currentTarget
      const cursorAtStart = input.selectionStart === 0 && input.selectionEnd === 0
      setCode(prev => {
        const newCode = [...prev]
        if (cursorAtStart && prev[selectedLine] !== '') {
          // Si hay texto y el cursor está al inicio, mueve el texto a la nueva línea y borra la actual
          newCode.splice(selectedLine, 0, prev[selectedLine])
          newCode[selectedLine + 1] = ''
        } else {
          newCode.splice(selectedLine + 1, 0, '')
        }
        return newCode
      })
      setSelectedLine(prev => prev + 1)
    }

    if ( event.key === 'Backspace' && code[selectedLine] === '' && selectedLine > 0 ) {
      event.preventDefault()
      setCode(prev => {
        const newCode = [...prev]
        newCode.splice(selectedLine, 1)
        return newCode
      })
      setSelectedLine(prev => Math.max(prev - 1, 0))
    }

    if ( event.key === 'ArrowUp' ) {
      event.preventDefault()
      setSelectedLine(prev => Math.max(prev - 1, 0))
    }

    if ( event.key === 'ArrowDown' ) {
      event.preventDefault()
      setSelectedLine(prev => Math.min(prev + 1, code.length - 1))
    }
  }

  const handleChange = (event: React.FormEvent<HTMLInputElement>, index: number) => {
    const linesOfCode = event.currentTarget.value
    const newCode = code.map((line, id) => (id === index ? linesOfCode : line))
    setCode(newCode)

    if (debounceTimer.current) clearTimeout(debounceTimer.current)
    debounceTimer.current = setTimeout(() => {
      const finalCode = newCode.join('\n')
      fetchData(finalCode)
    }, 1500)
  }

  useEffect(() => {
    const input = inputRefs.current[selectedLine]
    if (input) input.focus()
  }, [selectedLine, code.length])

  return (
    <main className='bg-black/90 h-dvh text-white/90 grid grid-cols-[5%_47.5%_47.5%] xl:grid-cols-[4%_48%_48%]'>
      <aside className='border-r-1 border-gray-800/90 py-5'>
        <ul className='flex flex-col gap-4'>
          <li className='flex items-center justify-center cursor-pointer' onClick={handleIconClick} title='Subir archivo .ru'>
            <svg className="w-12 h-12 text-gray-800 dark:text-white" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24">
              <path stroke="currentColor" strokeLinejoin="round" strokeWidth="1.1" d="M15 4v3a1 1 0 0 1-1 1h-3m2 10v1a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1v-7.13a1 1 0 0 1 .24-.65L6.7 8.35A1 1 0 0 1 7.46 8H9m-1 4H4m16-7v10a1 1 0 0 1-1 1h-7a1 1 0 0 1-1-1V7.87a1 1 0 0 1 .24-.65l2.46-2.87a1 1 0 0 1 .76-.35H19a1 1 0 0 1 1 1Z" />
            </svg>
            <input
              type='file'
              accept='.ru'
              ref={fileInputRef}
              style={{ display: 'none' }}
              onChange={handleFileChange}
            />
          </li>
          <li className='flex items-center justify-center cursor-pointer' onClick={handleSaveClick} title='Guardar archivo .ru'>
            <svg className="w-10 h-10 text-gray-800 dark:text-white" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24">
              <path stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="1" d="M19 10V4a1 1 0 0 0-1-1H9.914a1 1 0 0 0-.707.293L5.293 7.207A1 1 0 0 0 5 7.914V20a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1v-2M10 3v4a1 1 0 0 1-1 1H5m5 6h9m0 0-2-2m2 2-2 2"/>
            </svg>
          </li>
        </ul>
      </aside>

      <div className='h-full flex flex-col pt-2'>
        <span
          className='text-sm px-3 py-1 bg-white/2 font-light rounded-tr-sm w-fit'
          contentEditable
          suppressContentEditableWarning
          spellCheck={false}
          onBlur={e => {
            let value = e.currentTarget.textContent?.trim() || ''
            if (!value.endsWith('.ru')) value += '.ru'
            setFile(value)
            e.currentTarget.textContent = value
          }}
          onKeyDown={(e: React.KeyboardEvent<HTMLSpanElement>) => {
            if (e.key === 'Enter') {
              e.preventDefault()
              (e.target as HTMLElement).blur()
            }
          }}
        >
          {file ? file : '[No file]'}
        </span>
        <div className='bg-white/2 h-full py-2 text-md flex w-full items-start flex-col gap-0'>
          {
            code.map((line, index) => (
              <div className='w-full grid grid-cols-[10%_90%] pr-4' key={index}>
                <span className='text-gray-700 text-right px-4 mr-4'>{index + 1}</span>
                <input
                  ref={el => {
                    if (el) inputRefs.current[index] = el
                  }}
                  onFocus={() => setSelectedLine(index)}
                  className='outline-none'
                  onKeyDown={ handleKeyDown }
                  value={line}
                  type="text"
                  onChange={event => handleChange(event, index)}
                />
              </div>
            ))
          }
        </div>
      </div>

      <p className={`border-l-1 border-gray-800/90 py-12 px-10 ${ result.includes('Error al traducir:') && 'font-bold text-red-400' } `}>{ result }</p>
    </main>
  )
}

export default App
