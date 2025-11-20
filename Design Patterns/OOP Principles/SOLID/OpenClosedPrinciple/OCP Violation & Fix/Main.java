
public class Main {

    public static void main(String[] args) {
        System.out.println("OCP Applied");
        DiscountService service1 = new DiscountService(new StudentDiscount());
        System.out.println("Student price: $" + service1.calculate(100));
        System.out.println();

    }
}