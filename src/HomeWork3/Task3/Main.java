package HomeWork3.Task3;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.setCoordinateX(50.435332);
        vehicle.setCoordinateY(30.529756);
        vehicle.setPrice(10.499);
        vehicle.setSpeed(195);
        vehicle.setYearOfConstruction(1996);
        vehicle.setPlaneHeight(10.184);
        vehicle.setPlaneNumberOfPassengers(50);
        vehicle.setShipNumberOfPassengers(6780);
        vehicle.setPortOfDestination("YUZHNY");

        System.out.println("\nИнформация для покупателей автомоибиля.");
        System.out.println("Год выпуска автомобиля " + vehicle.getYearOfConstruction());
        System.out.println("Максимальная скорость автомобиля " + vehicle.getSpeed() + " км/ч");
        System.out.println("Цена автомобиля " + vehicle.getPrice() + "$");
        System.out.println("Сейчас автомобиль находится по таким координатам X - " + vehicle.getCoordinateX() + ", Y - " + vehicle.getCoordinateY());

        System.out.println("\nИнформация для пассажиров самолёта.");
        System.out.println("Высота на которой находится самолёт - " + vehicle.getPlaneHeight());
        System.out.println("Количество находящихся пассажиров на борту самолёта - " + vehicle.getPlaneNumberOfPassengers());

        System.out.println("\nИнформация для пассажиров корабля.");
        System.out.println("Количество пассажиров находящихся на корабле составляет " + vehicle.getShipNumberOfPassengers());
        System.out.println("Порт приписки " + vehicle.getPortOfDestination());
    }
}
