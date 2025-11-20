
public class DeliveryCompany {

    private DeliveryService DS;

    public DeliveryCompany(DeliveryService DS) {
        this.DS = DS;

    }

    public void sendproduct(Product product) {
        this.DS.deliverproduct(product);
    }
}
