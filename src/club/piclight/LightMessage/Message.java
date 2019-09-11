package club.piclight.LightMessage;

import java.util.Date;

public class Message {
    private Date date; //Record Message Time
    private String user; //Send By
    private String message; //Message Info

    public Message(Date date, String user, String message) {
        this.date = date;
        this.user = user;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
