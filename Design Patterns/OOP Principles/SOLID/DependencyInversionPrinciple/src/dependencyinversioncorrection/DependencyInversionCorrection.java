package dependencyinversioncorrection;

public class DependencyInversionCorrection {

    public static void main(String[] args) {
        Product P = new Product();
        DeliveryDriver DD = new DeliveryDriver();
        DeliveryCompany DC = new DeliveryCompany(DD);
      //  DC.sendproduct(P);
    }
    
}
