import java.util.Date;
import java.lang.Math;
public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;


    public Loan(){

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    
    public int getNumberOfYears(){
        return this.numberOfYears;
    }
    
    public double getLoanAmount(){
        return this.loanAmount;
    }
    public Date getLoanDate(){
        this.loanDate = new Date();
        return this.loanDate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment(){
        double month = (this.annualInterestRate/12)/100;
        double a = this.loanAmount * month;
        double b = 1 - (1/ Math.pow((1+month),(this.numberOfYears * 12)));
        double monthlypayment =  a/b;
        return monthlypayment;
    }
    public double getTotalPayment(){
        double totalpayment = getMonthlyPayment() * this.numberOfYears *12;
        return totalpayment;
    }
}
