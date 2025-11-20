
public class SingleResponsiblity {

    public static void main(String[] args) {
        Customer customer = new Customer("Mohamed Abolyazeed");
        CustomerDB db = new CustomerDB();
        db.storeCustomer(customer.getName());
        CustomerClassGenerator reportGenerator = new CustomerClassGenerator();
        reportGenerator.generateReport(customer.getName());
    }
}
