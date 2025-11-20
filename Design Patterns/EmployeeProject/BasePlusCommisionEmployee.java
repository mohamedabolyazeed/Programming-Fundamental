package EmployeeProject;

public class BasePlusCommisionEmployee extends CommissionEmployee{
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
  
    @Override
    public double earning (){
        return super.earning() + base;
    }
    
    @Override
    public void displaydetail() {
        super.displaydetail() ;
        displayearnings();
    }
    
     @Override
    public void displayearnings() {
         System.out.println("Display Earnings" + earning());
    }

}
