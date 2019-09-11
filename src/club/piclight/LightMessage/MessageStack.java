package club.piclight.LightMessage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class MessageStack {
    private ArrayList<Message> messages;
    private static MessageStack messageStack = new MessageStack();

    private MessageStack() {
        messages = new ArrayList<Message>();
        messages.add(new Message(new Date(), "Admin", "Hello World"));
    }

    static MessageStack getMessageStack() {
        return messageStack;
    }

    void addMessage(Message message) {
        if(message.getMessage().equals("/clear")) {
            messageStack = new MessageStack();
        } else {
            messages.add(message);
        }
    }

    Iterator<Message> getMessageIterator() {
        return messages.iterator();
    }
}
