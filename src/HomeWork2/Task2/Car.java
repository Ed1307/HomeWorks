package HomeWork2.Task2;

public class Car {

    private int age;
    private String color;

    public Car() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor()  {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
