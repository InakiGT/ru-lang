# RU server
Servidor de RU realizado con antlr y Java

## Instalación y compilado
Este repositorio ya incluye los paquetes necesarios para ejecutar el programa, no es necesario realizar instalaciones ni compilaciones

En caso de querer volver a generar los scripts generados por antlr se ejecuta el comando:
```
javac -cp "<ruta>/antlr/antlr4/4.13.2/antlr4-4.13.2-complete.jar:." ./*.java
```
Donde \<ruta\> es la ruta donde se encuentra el paquete de antlr4 

## Ejecución
Para ejecutar el servidor se ejecuta el comando:
```
java -cp "<ruta>/antlr/antlr4/4.13.2/antlr4-4.13.2-complete.jar:." Server
```
Donde \<ruta\> es la ruta donde se encuentra el paquete de antlr4 

También hay un launcher que ejecuta directamente código fuente .ru que lee en el mismo directorio en el archivo nombrado main.ru
```
java -cp "<ruta>/antlr/antlr4/4.13.2/antlr4-4.13.2-complete.jar:." Launcher
```
Aunque el funcionamiento optimo está en el Server

Una vez corriendo el servidor se debe correr el servidor frontend del editor, para ello están las instrucciones en su propio repositorio