package employeeproject;

public class SalariedEmployee extends Employee implements Displayable {
    
    private double salary;
    private double bouns;
    private double deductions;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bouns, double deductions, String name, int SSN, String address,
            Gender sex) {
        super(name, SSN, address, sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    @Override
    public double earning() {
        return (salary + bouns) - deductions;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displaydetail() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void displayearnings() {
        System.out.println("The total earnng of the salaried employee is" + earning());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }
    
}
