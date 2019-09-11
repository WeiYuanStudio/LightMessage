package club.piclight.LightMessage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "SendMessage", urlPatterns = "/send")
public class SendMessage extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String messageString = req.getReader().readLine();

        Message message = new Message(new Date(), req.getRemoteAddr(), messageString);

        MessageStack messageStack = MessageStack.getMessageStack();
        messageStack.addMessage(message);

        resp.setCharacterEncoding("UTF-8");
        resp.setStatus(200);
    }
}
