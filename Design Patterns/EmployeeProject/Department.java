package EmployeeProject;

import java.util.ArrayList;

public class Department {

    private int idno;
    private String deptname;
    private ArrayList<Employee> Emp;

    public Department() {

    }

    public Department(int idno, String deptname) {
        this.idno = idno;
        this.deptname = deptname;
        this.Emp = new ArrayList<Employee>();
    }

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public ArrayList<Employee> getEmp() {
        return Emp;
    }

    public void setEmp(ArrayList<Employee> Emp) {
        this.Emp = Emp;
    }

    public void addEmployee(Employee e) {
        Emp.add(e);
    }

    public void removeEmployee(int idx) {
        Emp.remove(idx);
    }

    public int getEmployeeCount() {
        return Emp.size();
    }

    public void print_basic_data() {
        for (int i = 0; i < Emp.size(); i++) {
            System.out.println(Emp.get(i).getSSN() + " " + Emp.get(i).getName() + " " + Emp.get(i).getSex());
        }
    }

    public void print_all_details() {
        for (Employee Emp1 : Emp) {
            if (Emp1 instanceof SalariedEmployee) {
                ((SalariedEmployee) Emp1).displaydetail();
            }
            if (Emp1 instanceof HourlyEmployee) {
                ((HourlyEmployee) Emp1).displaydetail();
            }
            if (Emp1 instanceof CommissionEmployee) {
                ((CommissionEmployee) Emp1).displaydetail();
            }
        }
    }
}
