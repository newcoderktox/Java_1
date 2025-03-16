class BankAccount{
    String accountNumber;
    double balance=0.0;

    BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void depositMoney(double amount){
        balance+=amount;
        System.out.println("Your new balance is: "+ balance);
    }

    public void withdrawMoney(double amount){
        if (balance>= amount){
            balance-=amount;
            System.out.println("Your new balance is: "+ balance);

        }else{
            System.out.println("Insufficent Funds. Withdraw is unsuccessful.");
        }
    }


}

class SavingsAccount extends BankAccount{
    double interestRate=0.0;

    SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    public void addInterestRate(){
        double interestAmount= balance*interestRate/100;
        balance+=interestAmount;
        System.out.println("Intesrest amount got added to your account. Your new balance is: "+balance);

    }
}

public class Bank_Account {
    public static void main(String[] args){
        BankAccount bankaccount =new BankAccount("0001", 9000.0);
        SavingsAccount savingsAccount =new SavingsAccount("0001", 9000.0, 1.5);

        System.out.println("Bank Account");
        bankaccount.withdrawMoney(100.0);
        bankaccount.depositMoney(100.0);
        bankaccount.withdrawMoney(10000.0);

        System.out.println("Savings Account");
        savingsAccount.addInterestRate();
        savingsAccount.depositMoney(500.0);
        savingsAccount.withdrawMoney(1000.0);


    }
}
