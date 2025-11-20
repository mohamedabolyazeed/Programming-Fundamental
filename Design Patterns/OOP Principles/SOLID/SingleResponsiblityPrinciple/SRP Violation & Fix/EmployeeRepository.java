
public class EmployeeRepository {

    public void save(Employee emp) {
        System.out.println("Saving " + emp.getName() + " to database");
    }
}
