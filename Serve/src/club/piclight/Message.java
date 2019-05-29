package club.piclight;

import java.util.Date;

/**
 * Save One Message
 */
class Message{
    private Date date;//Message Time
    private String User;//Send By
    private String Message;//Message

    public Message(Date date, String user, String message) {
        this.date = date;
        User = user;
        Message = message;
    }
}