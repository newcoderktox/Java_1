import java.util.Scanner;
public class Hesap_makinesi {
    public static void main (String[] args){
        float result=0;
        char operator = '+';
        boolean cont;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1= scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int num2= scanner.nextInt();

        System.out.println("Please choose the operator: ");
        char op= scanner.next().charAt(0);

        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Please try again. There is an error.");

        }
        System.out.println("Your result is "+result);
    }
}
