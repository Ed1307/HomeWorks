package HomeWork.Book;

import java.util.Scanner;

public class Title {
    public static void show() {

        System.out.print("\nEnter the title of the book: ");
        Scanner Title = new Scanner(System.in);
        String title = Title.nextLine();

        System.out.println("Title: " + title);
    }
}
