package virginia.com;

public class Add implements Calculate{

    private double firstNum;
    private double secondNum;

    public Add() {
    }

    public Add(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public void calculate(double firstVal, double secondVal) {
        double result = firstVal + secondVal;
        System.out.println("Your result is " + result +
                " (" + firstVal + " + " + secondVal + ")" );
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
}
