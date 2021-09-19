package HomeWork6.AddTask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("\nCalculator");

        Scanner number1 = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int num1 = number1.nextInt();

        Scanner numeber2 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int num2 = numeber2.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.print("Choose the sign (+, -, *, /): ");
        String operation1 = operation.next();

        switch (operation1) {
            case "+":
                System.out.println("\nThe result of " + num1 + " " + operation1 + " " + num2 + " is " + (num1 + num2));
                break;
            case "-":
                System.out.println("\nThe result of " + num1 + " " + operation1 + " " + num2 + " is " + (num1 - num2));
                break;
            case "*":
                System.out.println("\nThe result of " + num1 + " " + operation1 + " " + num2 + " is " + (num1 * num2));
                break;
            case "/":
                System.out.println("\nThe result of " + num1 + " " + operation1 + " " + num2 + " is " + (num1 / num2));
                break;
            default:
                System.out.println("\nYou entered the wrong character! Try again!");
        }
    }
}
