package HomeWork.Book;

import java.util.Scanner;

public class Content {
    public static void show() {

        System.out.print("Enter the content of the book: ");
        Scanner Content = new Scanner(System.in);
        String content = Content.nextLine();

        System.out.println("Content: " + content);
    }
}
