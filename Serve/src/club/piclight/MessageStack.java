package club.piclight;

import java.util.Date;
import java.util.Vector;

/**
 * Save Messages As A Stack
 * @author WeiYuan
 * @version 0.1
 * @since JDK 11.0.2
 */
class MessageStack {
    private Vector<Message> messages; //A Vector for message

    MessageStack() {
        messages = new Vector<>();
        addMessage(new Message(new Date(),"WeiYuan's ChatBot", "Welcome To My ChatRoom")); //Auto add a message when start up
    }

    /**
     * Add A Message To Stack
     * @param message
     */
    void addMessage(Message message){
        messages.add(message);
    }

    /**
     * Get Num Of Messages
     * @return
     */
    int getMessageNum() {
        return messages.size();
    }

    /**
     * Get A Message In Stack By Index
     * @param index
     * @return
     */
    Message getMessageAt(int index) {
        return messages.get(index);
    }

    /**
     * Get All Messages
     * @return
     */
    Vector<Message> getMessages() {
        return messages;
    }
}
