
public class HumanWorker implements Workable, Breakable, Eatable, Sleepable {

    public void work() {
        System.out.println("Human working");
    }

    public void takeBreak() {
        System.out.println("Human taking break");
    }

    public void eat() {
        System.out.println("Human eating");
    }

    public void sleep() {
        System.out.println("Human sleeping");
    }
}
