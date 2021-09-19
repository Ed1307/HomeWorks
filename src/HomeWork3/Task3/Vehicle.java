package HomeWork3.Task3;

public class Vehicle {

    private double coordinateX, coordinateY;
    private double price;
    private int speed, yearOfConstruction;
    private double planeHeight;
    private int planeNumberOfPassengers;
    private int shipNumberOfPassengers;
    private String portOfDestination;

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public double getPlaneHeight() {
        return planeHeight;
    }

    public void setPlaneHeight(double planeHeight) {
        this.planeHeight = planeHeight;
    }

    public int getPlaneNumberOfPassengers() {
        return planeNumberOfPassengers;
    }

    public void setPlaneNumberOfPassengers(int planeNumberOfPassengers) {
        this.planeNumberOfPassengers = planeNumberOfPassengers;
    }

    public int getShipNumberOfPassengers() {
        return shipNumberOfPassengers;
    }

    public void setShipNumberOfPassengers(int shipNumberOfPassengers) {
        this.shipNumberOfPassengers = shipNumberOfPassengers;
    }

    public String getPortOfDestination() {
        return portOfDestination;
    }

    public void setPortOfDestination(String portOfDestination) {
        this.portOfDestination = portOfDestination;
    }


    public class Plane extends Vehicle {
    }

    public class Ship extends Vehicle {
    }

    public class Car extends Vehicle {
    }
}
