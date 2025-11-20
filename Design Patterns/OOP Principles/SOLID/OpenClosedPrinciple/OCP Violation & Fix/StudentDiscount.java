
public class StudentDiscount implements Discount {

    public double apply(double amount) {
        return amount * 0.70;
    }
}
