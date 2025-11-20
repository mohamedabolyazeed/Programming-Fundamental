
public class Main {

    public static void main(String[] args) {
        Notification email = NotificationFactory.getNotification("EMAIL");
        email.send();
        Notification sms = NotificationFactory.getNotification("SMS");
        sms.send();
        Notification push = NotificationFactory.getNotification("PUSH");
        push.send();
    }
}
