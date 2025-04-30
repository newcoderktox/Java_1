interface Payable{
    double getPaymentAmount();
}

class Invoice implements Payable{
    private String partNumber;
    private int quantity;
    private double pricePerItem;

    public String getPartNumber(){
        return partNumber;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }
    public void setQuantity(int quantity){
        this.quantity= quantity;
    }
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem=pricePerItem;
    }
    @Override
    public double getPaymentAmount() {
        return getQuantity()*getPricePerItem();
    }
    @Override
    public String toString() {
        return "Invoice: Part Number: " + partNumber + ", Quantity: " + quantity + ", Price per Item: $" + pricePerItem;
    }

    public Invoice(String partNumber, int quantity, double pricePerItem){
        this.partNumber= partNumber;
        this.quantity= quantity;
        this.pricePerItem=pricePerItem;
    }
}
abstract class Employe0 implements Payable {
    private String name;
    private String ssn;

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setName() {
        this.name = name;
    }

    public void setSsn() {
        this.ssn = ssn;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", SSN: " + getSsn();
    }


    abstract double earnings();

    public Employe0(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public double getPaymentAmount(){
        return earnings();
    }
}

class SalariedEmployee0 extends Employe0{
    private double weeklySalary;

    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary=weeklySalary;
    }
    @Override
    double earnings() {
        return weeklySalary*4;
    }
    public SalariedEmployee0(String name, String ssn, double weeklySalary){
        super(name, ssn);
        this.weeklySalary=weeklySalary;
    }
    @Override
    public double getPaymentAmount(){
        return earnings();
    }
    @Override
    public String toString() {
        return super.toString() + ", Weekly Salary: $" + weeklySalary;
    }


}
public class PayableInt {
    public static void main(String [] args){

        Payable [] payables = new Payable[2];
        payables [0] = new Invoice ("111", 100, 20);
        payables [1] = new SalariedEmployee0 ("nisa","10000000",800);

        for (Payable payabless : payables){
            System.out.println(payabless);
            System.out.println(" " + payabless.getPaymentAmount());
        }
    }
}
