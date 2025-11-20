
public class SeasonalDiscount implements Discount {

    public double apply(double amount) {
        return amount * 0.80;
    }
}
