package Homeworks;
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
        System.out.println("New employee object is created!");
    }

    public void printInfo(){
        System.out.println("----INFO----");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department=department;
        System.out.println("New manager object is created!");
    }
    @Override
    public void printInfo(){
        System.out.println("----INFO----");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);

    }
}
public class EmployeeAndManager {
    public static void main(String[] args){
        Employee employee = new Employee ("Nisanur Celebi", 10000);
        Manager manager = new Manager ("Ayse Yilmaz", 10000,"computer science");

        employee.printInfo();
        manager.printInfo();
    }
}
