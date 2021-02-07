
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messageObject;

    public MessagingService() {
        this.messageObject = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messageObject.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messageObject;
    }
}
