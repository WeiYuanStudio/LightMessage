package club.piclight;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.util.Date;

/**
 * Get the Message By HTTP POST Method
 *
 * @author WeiYuan
 * @version 0.1
 * @since JDK 11.0.2
 */
public class SendMessage implements HttpHandler {
    private String messageStr;
    private MessageStack messageStack;

    SendMessage(MessageStack messageStack) {
        this.messageStack = messageStack;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {

        String remoteIP = httpExchange.getRemoteAddress().getHostName(); // Visitor's IP

        InputStream requestStream = httpExchange.getRequestBody();//Get request stream

        messageStr = new BufferedReader(new InputStreamReader(requestStream)).readLine(); //Read request stream to a String

        requestStream.close();

        Message message = new Message(new Date(), remoteIP, messageStr);

        messageStack.addMessage(message);

        System.out.println("Get A Message From: " + remoteIP + '\n' + "Message: " + messageStr); //SOUT A Log


        httpExchange.sendResponseHeaders(200, 0); //Send Response Head

        OutputStream responseStream = httpExchange.getResponseBody();

        responseStream.write("Send Success".getBytes()); //Write Response stream

        responseStream.close(); //Close Response stream


        httpExchange.close();
    }
}