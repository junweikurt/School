import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        float interestrate= input.nextFloat();
        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        float loanamount= input.nextFloat();
        Loan newloan = new Loan(interestrate,years,loanamount);
        System.out.println("The loan was created on " + newloan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f",newloan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f",newloan.getTotalPayment()));
    }
}
