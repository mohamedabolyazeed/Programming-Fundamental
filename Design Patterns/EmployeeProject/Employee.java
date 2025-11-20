package EmployeeProject;

enum Gender {Male, Female};

public abstract class Employee {
    private String name;
    private int SSN;
    private String address;
    private Gender sex; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee() {
    }

    public Employee(String name, int SSN, String address, Gender sex) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.sex = sex;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
    public abstract double earning ();

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", SSN=" + SSN + ", address=" + address + ", sex=" + sex + '}';
    }
    
           
}
