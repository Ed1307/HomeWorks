package HomeWork2.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("\nEntre the information about you car.");

        System.out.print("\nEnter the age of your vehicle: ");
        Scanner setAge = new Scanner(System.in);
        int age = setAge.nextInt();

        System.out.print("Enter the maximum speed of your vehicle: ");
        Scanner setSpeed = new Scanner(System.in);
        int speed = setSpeed.nextInt();

        System.out.print("Enter the weight of your vehicle: ");
        Scanner setWeight = new Scanner(System.in);
        int weight = setWeight.nextInt();

        System.out.print("Enter the color of your car: ");
        Scanner setColor = new Scanner(System.in);
        String color = setColor.next();

        car.setAge(age);
        car.setSpeed(speed);
        car.setWeight(weight);
        car.setColor(color);

        System.out.print("\nBelow is information about your car.");

        System.out.println("\nYour car's age is: " + car.getAge() + ".");
        System.out.println("The maximum speed of your vehicle is: " + car.getSpeed() + ".");
        System.out.println("Your car weight is: " + car.getWeight() + ".");
        System.out.println("Oh, " + car.getColor() + " is great color :)");


    }
}
