
public class Person {

    private Driver driver;

    public Person(Driver driver) {
        this.driver = driver;
    }

    public void goToWork() {
        driver.drive();
    }
}
