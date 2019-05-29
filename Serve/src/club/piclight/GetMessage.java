package club.piclight;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Response the request of get message
 * @author WeiYuan
 * @version 0.1
 * @since JDK 11.0.2
 */
public class GetMessage implements HttpHandler {
    private MessageStack messageStack;

    public GetMessage(MessageStack messageStack) {
        this.messageStack = messageStack;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        String remoteIP = httpExchange.getRemoteAddress().getHostName();

        System.out.println("Get a request from: " + remoteIP);

        httpExchange.sendResponseHeaders(200,0);

        String responseBody = new Gson().toJson(messageStack);

        OutputStream responseStream = httpExchange.getResponseBody();

        responseStream.write(responseBody.getBytes());

        responseStream.close();

        System.out.println("Had Response Request: " + responseBody);

        httpExchange.close();
    }
}
