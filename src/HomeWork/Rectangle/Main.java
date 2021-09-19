package HomeWork.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle.rectangle rec = new Rectangle.rectangle();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1, num2);
        rec.areaCalculator(num1, num2);


        rec.viewResult();
    }
}