package HomeWork2.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.print("Enter something: ");
        Scanner setYear = new Scanner(System.in);
        int year = setYear.nextInt();

        System.out.println(car.getYear());
    }
}
