package employeeproject;

public class EmployeeProject {


    public static void main(String[] args) {
        Department D1 = new Department(1, "Information System");
        
        SalariedEmployee Se = new SalariedEmployee(2000, 500, 50, "Ahmed", 1200, "Gada", Gender.Male);
        D1.addEmployee(Se);
        
        //(String name, int SSN, String address, Gender sex,double hour_rate,int no_of_hours) {
        HourlyEmployee He = new HourlyEmployee("Mohamed", 1300, "Riyadh", Gender.Male, 100,6);
        D1.addEmployee(He);
        
        CommissionEmployee Ce = new CommissionEmployee("Mahmoud", 1400, "Gada", Gender.Male, 15000,0.25);
        D1.addEmployee(Ce);
        
        System.out.println(D1.getEmployeeCount());
       
        D1.print_basic_data();
        D1.print_all_details();
        
    }
    
}
