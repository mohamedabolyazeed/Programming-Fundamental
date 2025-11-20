
public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Mohamed");
        emp.setSalary(50000);
        new EmployeeRepository().save(emp);
        new PayrollService().generateReport(emp);
        System.out.println();
    }
}
