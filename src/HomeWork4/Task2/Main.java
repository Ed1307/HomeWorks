package HomeWork4.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            String formatDoc;
            Scanner in = new Scanner(System.in);
            System.out.print("\nНапишите формат вашего документа (XML, TXT, DOC): ");
            formatDoc = in.next();

            if (formatDoc.equals("XML")) {
                AbstractHandler xml = new XMLHandler();
                xml.open();
                xml.create();
                xml.change();
                xml.save();
                break;

            } else if (formatDoc.equals("TXT")) {
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
                break;

            } else if (formatDoc.equals("DOC")) {
                AbstractHandler doc = new DOCHandler();
                doc.open();
                doc.create();
                doc.change();
                doc.save();
                break;

            } else
                System.out.println("Не верный формат! Попытайтесь ещё раз!");
            break;
        }
    }
}
