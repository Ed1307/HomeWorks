package HomeWork.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        System.out.print("\n Enter your zip code: ");
        Scanner setIndex = new Scanner(System.in);
        int index = setIndex.nextInt();

        System.out.print("Enter your country: ");
        Scanner setCountry = new Scanner(System.in);
        String country = setCountry.nextLine();

        System.out.print("Enter your city: ");
        Scanner setCity = new Scanner(System.in);
        String city = setCity.nextLine();

        System.out.print("Enter your street: ");
        Scanner setStreet = new Scanner(System.in);
        String street = setStreet.nextLine();

        System.out.print("Enter your house: ");
        Scanner setHouse = new Scanner(System.in);
        int house = setHouse.nextInt();

        System.out.print("Enter your apartment: ");
        Scanner setApartment = new Scanner(System.in);
        int apartment = setApartment.nextInt();

        System.out.println("*--------*--------*--------*");
        System.out.println("Your zip code: " + address.getIndex());
        System.out.println("Your country: " + address.getCountry());
        System.out.println("Your city: " + address.getCity());
        System.out.println("Your street" + address.getStreet());
        System.out.println("Your house: " + address.getHouse());
        System.out.println("Your apartment: " + address.getApartment());

        address.setIndex(index);
        address.setCountry(country);
        address.setCity(city);
        address.setStreet(street);
        address.setHouse(house);
        address.setApartment(apartment);
    }
}
