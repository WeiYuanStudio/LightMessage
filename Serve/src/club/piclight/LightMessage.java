package club.piclight;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author WeiYuan
 * @version 0.1
 * @since JDK 11.0.2
 */
public class LightMessage {
    private static HttpServer server;
    private static MessageStack messageStack = new MessageStack();
    private static int serverPort = 3939; //Set Server Port

    public static void main(String[] args) {
            try {
                server = HttpServer.create(new InetSocketAddress(serverPort), 0);
            } catch (IOException e) {
                System.err.println("The Port " + serverPort + " Was Unable To Start Up");
            }

            server.createContext("/send", new GetMessage(messageStack));

            server.start();
    }
}