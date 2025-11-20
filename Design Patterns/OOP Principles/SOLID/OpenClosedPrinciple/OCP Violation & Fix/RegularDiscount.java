
public class RegularDiscount implements Discount {

    public double apply(double amount) {
        return amount * 0.95;
    }
}
