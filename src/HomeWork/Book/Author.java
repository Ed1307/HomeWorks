package HomeWork.Book;

import java.util.Scanner;

public class Author {
    public static void show() {

        System.out.print("Enter the author of the book: ");
        Scanner Author = new Scanner(System.in);
        String author = Author.nextLine();

        System.out.println("Author: " + author);
    }
}
