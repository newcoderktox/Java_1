class Employee {
    String name;
    String surname;
    double salary;
    int yearsWorked;

    Employee(String name, String surname, double salary, int yearsWorked){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.yearsWorked=yearsWorked;
    }
    double calculateSalary(){
        return salary;
    }
}

class Manager extends Employee{
    String department;

    Manager(String name, String surname, double salary, int yearsWorked, String department){
        super(name, surname, salary, yearsWorked);
        this.department=department;
    }
    @Override
    double calculateSalary(){
        double bonus=500;
        return salary+bonus;
    }
}
class Programmer extends Employee{
    String specialization;

    Programmer(String name, String surname, double salary, int yearsWorked, String specialization){
        super(name, surname, salary, yearsWorked);
        this.specialization=specialization;
    }
    @Override
    double calculateSalary(){
        double bonusX=10;
        return salary*(100+bonusX)/100;
    }
}
public class Employee_System {
    public static void main(String[] args){
        Manager manager= new Manager("Nisanur", "Celebi", 4000, 5, "management");
        Programmer programmer = new Programmer ("Nisa", "celebi", 5000, 5, "Cybersecurity");

        System.out.println("Name: "+ manager.name);
        System.out.println("Salary: "+ manager.calculateSalary());
        System.out.println("Name: "+programmer.name);
        System.out.println("Salary: "+ programmer.calculateSalary());
    }
}
