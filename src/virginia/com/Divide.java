package virginia.com;

public class Divide {

    private double firstNum;
    private double secondNum;

    public Divide() {
    }

    public Divide(double firstVal, double secondVal) {
        this.firstNum = firstVal;
        this.secondNum = secondVal;
    }

    public void calculate(double firstNum, double secondNum) {
        double result = (firstNum / secondNum);
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
