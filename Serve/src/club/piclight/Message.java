package club.piclight;

import java.util.Date;

/**
 * Save One Message
 */
class Message{
    private Date date;//Message Time
    private String user;//Send By
    private String message;//Message

    public Message(Date date, String user, String message) {
        this.date = date;
        this.user = user;
        this.message = message;
    }
}