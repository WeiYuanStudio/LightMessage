package club.piclight.LightMessage;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.*;

@WebServlet(name = "GetMessage", urlPatterns = "/get")
public class GetMessage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log("Get Request From: " + req.getRemoteAddr());

        String responseBody = new Gson().toJson(MessageStack.getMessageStack());

        resp.setCharacterEncoding("UTF-8");
        resp.setStatus(200);
        resp.setContentType("text/json");

        ServletOutputStream out = resp.getOutputStream();
        out.println(responseBody);
        out.flush();
        out.close();
    }
}
