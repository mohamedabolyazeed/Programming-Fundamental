
public class Main {

    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        c1.printdata();
        Counter c2 = Counter.getInstance();
        c2.printdata();
        System.out.println("Are objects same? " + (c1 == c2));
    }
}
