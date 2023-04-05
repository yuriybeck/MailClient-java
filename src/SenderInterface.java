import javax.mail.Message;
import javax.mail.Session;

/**
 * new interface
 */
public interface SenderInterface {

    Session getInstance();

    Message createMessage(Session session, Mail mail);

    boolean send(Message message);
}
