
public class InterfaceSegreggation {

    public static void main(String[] args) {

        Worker worker = new Employee();
        worker.work(); // Output: "Employee is working"

        Eatable eater = new Employee();
        eater.eat(); // Output: "Employee is eating"

        Worker robot = new Robot();
        robot.work(); // Output: "Robot is working"
    }

}
