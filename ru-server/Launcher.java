import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Launcher {

    public static void main(String[] args) throws Exception {
        // Cadena de entrada (puedes cambiarla por otra expresión)
        String input = Files.readString(Path.of("main.ru"));

        // 1. Crear un flujo de entrada desde la cadena
        CharStream chars = CharStreams.fromString(input);

        // 2. Crear el Lexer (tokenizador)
        RuLexer lexer = new RuLexer(chars);

        // 3. Crear un flujo de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 4. Crear el Parser (analizador sintáctico)
        RuParser parser = new RuParser(tokens);

        // 5. Parsear la entrada y obtener el árbol sintáctico
        ParseTree tree = parser.programa();  // 'prog' es la regla inicial

        // 6. Crear el visitor personalizado
        MyVisitor visitor = new MyVisitor();

        // 7. Evaluar el árbol con el visitor
        Object resultado = visitor.visit(tree);
    }
}