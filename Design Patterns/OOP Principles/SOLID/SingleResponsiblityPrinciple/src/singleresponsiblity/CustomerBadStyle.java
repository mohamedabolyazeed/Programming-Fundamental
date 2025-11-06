package singleresponsiblity;

// Bad example: all responsibilities in one class (violates SRP)
public class CustomerBadStyle {
    
    private String name;
    
    public void storeCustomer(String customername) {
        System.out.println("Storing: " + customername);
    }
    
    public void generateCustomerReport(String customername) {
        System.out.println("Report for: " + customername);
    }
}