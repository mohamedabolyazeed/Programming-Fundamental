public class DecoratorPattern {

  public static void main(String[] args) {
    Notifier notifier = new BasicNotifier();
    notifier = new SMSNotifier(notifier);
    notifier = new FacebookNotifier(notifier);
    notifier = new SlackNotifier(notifier);
    notifier.send("Your house is on fire!");
  }
}
