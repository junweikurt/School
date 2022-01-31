import java.lang.Math;
public class BMI {
    private double weight;
    private double height;
    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double calculateBMI(){
        double finalweight = this.weight * 0.45359237;
        double finalheight = this.height * 0.0254;
        double bmi = finalweight/Math.pow(finalheight,2);
        return bmi;
    }
    public String BMIinterpretation(){
        if (calculateBMI() < 18.5){
            return "Underweight";
        }
        else if (calculateBMI()< 25){
            return "Normal";
        }
        else if (calculateBMI() < 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }

}
