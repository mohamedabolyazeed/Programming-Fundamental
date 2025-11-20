
public class Main {

    public static void main(String[] args) {
      HumanWorker humanWorker = new HumanWorker();
      RobotWorker robotWorker = new RobotWorker();

      humanWorker.work();
      humanWorker.takeBreak();
      humanWorker.eat();
      humanWorker.sleep();

      robotWorker.work();
    }
}
