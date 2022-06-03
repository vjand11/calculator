package virginia.com;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        String firstNum = scanner.next();
        System.out.println("Enter your second number: ");
        String secondNum = scanner.next();
        System.out.println();

        System.out.println("...now adding...");
        Add add = new Add();
        add.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
        System.out.println();

        System.out.println("...now subtracting...");
        Subtract subtract = new Subtract();
        subtract.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
        System.out.println();

        System.out.println("...now multiplying...");
        Multiply multiply = new Multiply();
        multiply.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
        System.out.println();

        System.out.println("...now dividing...");
        Divide divide = new Divide();
        divide.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));

    }

}
