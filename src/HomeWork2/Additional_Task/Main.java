package HomeWork2.Additional_Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("\nВведите радиус: ");
        Scanner radiusScan = new Scanner(System.in);
        double radius = radiusScan.nextDouble();

        System.out.println("Площядь круга из " + radiusScan + " составляет " + MyArea.areaOfCircle(radius));

    }
}
