
public class PayrollService {

    public void generateReport(Employee emp) {
        System.out.println("Report: " + emp.getName() + " earns $" + emp.getSalary());
    }
}
