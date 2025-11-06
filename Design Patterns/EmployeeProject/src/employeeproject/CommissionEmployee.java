package employeeproject;

public class CommissionEmployee extends Employee implements Displayable{

    private double gross_sales;
    private double comission_rate;

    public CommissionEmployee() {
    }
    public CommissionEmployee(String name, int SSN, String address, Gender sex, double gross_sales, 
            double comission_rate) {
        super(name, SSN, address, sex);
        this.gross_sales = gross_sales;
        this.comission_rate = comission_rate;
    }
    public double getGross_sales() {
        return gross_sales;
    }
    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getComission_rate() {
        return comission_rate;
    }
    public void setComission_rate(double comission_rate) {
        this.comission_rate = comission_rate;
    }
    
    @Override
    public double earning() {
        return gross_sales * comission_rate;
    }
    @Override
    public void displaydetail() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public String toString() {   
        return "CommissionEmployee{" + "gross_sales=" + gross_sales + ", comission_rate=" + comission_rate + '}';
    }
    @Override
    public void displayearnings() {
        System.out.println(earning());
    }
    
}
