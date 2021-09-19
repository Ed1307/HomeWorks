package HomeWork6.Task2;

import java.util.Scanner;

public class Vehicle {

    public static void main(String[] args) {

        Wheel wheel = new Wheel();
        Door door = new Door();
        wheel.printWheelColor();
        door.printDoorColor();
    }
}


class Wheel {
    protected String wheelColor;

    void printWheelColor() {
        Scanner wheelColor = new Scanner(System.in);
        System.out.print("Enter your wheel color: ");
        String color = wheelColor.nextLine();
        System.out.println("Your wheel's color is: " + color);
    }
}

class Door {
    private String doorColor;

    void printDoorColor() {
        Scanner doorColor = new Scanner(System.in);
        System.out.print("Enter your door color: ");
        String color = doorColor.nextLine();
        System.out.println("Your door's color is: " + color);
    }
}
