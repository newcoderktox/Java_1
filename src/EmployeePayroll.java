abstract class Employeee{
    private String name;
    private String lastName;
    private int age;
    private String ssn;

    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getSsn(){
        return ssn;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSsn(String ssn){
        this.ssn=ssn;
    }


    abstract double earnings();
    public String toString(){
        return name + " " + lastName + " \nSocial Security Number: " + ssn;
    }

    public Employeee(String name, String lastName, int age, String ssn) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }
}


class SalariedEmployee extends Employeee{
    private double weeklySalary;

    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary=weeklySalary;
    }
    public SalariedEmployee(String name, String lastName, int age, String ssn, double weeklySalary){
        super(name, lastName, age, ssn);
        if (weeklySalary<0.0){
            System.out.println("The salary can't be negative");
        }
        this.weeklySalary=weeklySalary;
    }
    @Override
    double earnings(){
        return weeklySalary;
    }
    @Override
    public String toString(){
        return "Salaried Employee: " + super.toString() + "\nWeekly Salary: " + weeklySalary;
    }

}
class HourlyEmployee extends Employeee {
    private double hourlyWage;
    private double hoursWorked;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String name, String lastName, int age, String ssn, double hourlyWage, double hoursWorked) {
        super(name, lastName, age, ssn);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double earnings() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString() + "\nHourly Wage: $" + String.format("%.2f", hourlyWage) + "\nHours Worked: " + hoursWorked;
    }

}

class CommissionEmployee extends Employeee{
    private double grossSales;
    private double commissionRate;

    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public void setGrossSales(double grossSales){
        this.grossSales=grossSales;
    }
    public void setCommissionRate(double comissionRate){
        this.commissionRate=comissionRate;
    }

    public CommissionEmployee (String name, String lastName, int age, String ssn, double grossSales, double commissionRate){
        super(name, lastName, age, ssn);
        this.grossSales= grossSales;
        this.commissionRate= commissionRate;
    }
    @Override
    double earnings(){
        return grossSales*commissionRate;
    }
    @Override
    public String toString(){
        return "Commission Employee: " + super.toString() + "\nGross Sales: $" + String.format("%.2f", grossSales) + "\nCommission Rate: " + commissionRate;
    }

}


public class EmployeePayroll {
    public static void main(String [] args){
        Employeee[] employees = new Employeee [3];
        employees[0] = new SalariedEmployee("nisa", "celebi", 19,"1234567890", 1000);
        employees[1] = new HourlyEmployee("kadir", "ı",21, "12312312312", 50, 160);
        employees[2] = new CommissionEmployee("denis", "i", 28, "12312312312", 10000,0.5);

        System.out.println("---Employee Payroll Details---\n");
        for (Employeee emp : employees){
            System.out.println(emp);
            System.out.println("Earned: $"+ emp.earnings());
        }
    }
}
