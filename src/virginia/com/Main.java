package virginia.com;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        String firstNum = scanner.next();
        System.out.println("Enter your second number: ");
        String secondNum = scanner.next();
        System.out.println("Enter the operation: ");
        String operation = scanner.next();
        String lowerCaseOp = operation.toLowerCase();
        System.out.println();
        
        try {
            if (lowerCaseOp.equals("add")) {
                System.out.println("...now adding...");
                Add addition = new Add();
                addition.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            } else if (lowerCaseOp.equals("subtract")) {
                System.out.println("...now subtracting...");
                Subtract subtract = new Subtract();
                subtract.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            } else if (lowerCaseOp.equals("multiply")) {
                System.out.println("...now multiplying...");
                Multiply multiply = new Multiply();
                multiply.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            } else if (lowerCaseOp.equals("divide")) {
                System.out.println("...now dividing...");
                Divide divide = new Divide();
                divide.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            } else {
                System.out.println("oh no");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

}
