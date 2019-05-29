package club.piclight;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;

/**
 * Get the Message By HTTP POST Method
 * @author WeiYuan
 * @version 0.1
 * @since JDK 11.0.2
 */
public class GetMessage implements HttpHandler {
    private String message;
    private MessageStack messageStack;

    GetMessage(MessageStack messageStack){
        this.messageStack = messageStack;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        String remoteIP = httpExchange.getRemoteAddress().getHostName(); // Visitor's IP

        InputStream requestStream = httpExchange.getRequestBody();


        message = new BufferedReader(new InputStreamReader(requestStream)).readLine();

        System.out.println(message); //Todo delete

        httpExchange.sendResponseHeaders( 200,0);

        OutputStream responseStream = httpExchange.getResponseBody();

        responseStream.write(("Hello World" + remoteIP).getBytes());

        responseStream.close();

        httpExchange.close();
    }
}