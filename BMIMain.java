import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        BMI newbmi = new BMI(weight,height);
        System.out.println("BMI is " + newbmi.calculateBMI());
        System.out.println(newbmi.BMIinterpretation());
    }
}
