package HomeWork.Rectangle;

public class Rectangle {

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
