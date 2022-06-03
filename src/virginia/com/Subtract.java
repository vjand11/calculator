package virginia.com;

public class Subtract {

    private double firstNum;
    private double secondNum;

    public Subtract() {}

    public Subtract(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public void calculate(double firstVal, double secondVal) {
        double result = (firstVal - secondVal);
        System.out.println("Your result is " + result);
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
