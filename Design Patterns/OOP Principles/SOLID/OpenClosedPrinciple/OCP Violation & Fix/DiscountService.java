
public class DiscountService {

    private Discount discount;

    public DiscountService(Discount discount) {
        this.discount = discount;
    }

    public double calculate(double amount) {
        return discount.apply(amount);
    }
}
