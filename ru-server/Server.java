import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Server {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/traducir", new TraductorHandler());
        server.setExecutor(null); // Usa el executor por defecto
        System.out.println("Servidor escuchando en http://localhost:8000/traducir");
        server.start();
    }

    static class TraductorHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) {
            try {
                exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
                exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "POST, OPTIONS");
                exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");
                if ("POST".equals(exchange.getRequestMethod())) {
                    InputStream is = exchange.getRequestBody();
                    String input = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                 
                    // ANTLR: analiza el código fuente enviado
                    CharStream charStream = CharStreams.fromString(input);
                    RuLexer lexer = new RuLexer(charStream);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    RuParser parser = new RuParser(tokens);
                    ParseTree tree = parser.programa(); // o el punto de entrada correcto

                    // Usa tu visitor para "traducir"
                    MyVisitor visitor = new MyVisitor();
                    Object resultado = visitor.visit(tree);

                    String response = resultado.toString();
                    exchange.sendResponseHeaders(200, response.getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                } else {
                    String response = "Usa POST con código fuente en el cuerpo";
                    exchange.sendResponseHeaders(405, response.getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                String response = "Error al traducir: " + e.getMessage();
                try {
                    exchange.sendResponseHeaders(500, response.getBytes().length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
