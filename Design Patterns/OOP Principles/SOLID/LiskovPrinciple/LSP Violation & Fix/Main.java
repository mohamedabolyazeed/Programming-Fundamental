
public class Main {

    public static void main(String[] args) {

        // Works perfectly - any Shape can be used
        Shape rect = new Rectangle();
        Shape sq = new Square();
        System.out.println("Area = " + rect.area());
        System.out.println("Area = " + sq.area());
    }
}
