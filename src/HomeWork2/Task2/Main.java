package HomeWork2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.print("\nEnter the year of your car: ");
        Scanner setAge = new Scanner(System.in);
        int age = setAge.nextInt();

        System.out.print("Enter the color of your car: ");
        Scanner setColor = new Scanner(System.in);
        String color = setColor.nextLine();

        car.setAge(age);
        car.setColor(color);

        System.out.println("Your car's year is: " + car.getAge() + " and the color is: " + car.getColor() + ".");
    }
}
