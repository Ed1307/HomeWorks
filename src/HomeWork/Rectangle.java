package HomeWork;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        rectangle rec = new rectangle();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1, num2);
        rec.areaCalculator(num1, num2);

        rec.viewResult();
    }
    public static class rectangle {
        public double side1, side2;

        public rectangle() {
        }

        public double areaCalculator(double num1, double num2) {
            side1 = (num1 * num2);
            return side1;
        }

        public double perimeterCalculator(double num1, double num2) {
            side2 = ((num1 + num2) * 2);
            return side2;
        }

        public void viewResult() {
            System.out.println("Площадь прямоугольника: " + side1);
            System.out.println("Периметра прямоугольника: " + side2);
        }
    }
}
