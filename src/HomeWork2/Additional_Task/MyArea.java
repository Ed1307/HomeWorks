package HomeWork2.Additional_Task;

public class MyArea {

    static final double Pi = 3.14;
    private double radius;

    public static double areaOfCircle(double radius) {

        double square = Pi * Math.pow(radius, 2);
        return square;
    }
}
