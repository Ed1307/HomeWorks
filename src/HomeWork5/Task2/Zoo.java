package HomeWork5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add(0, "\nCat");
        list.add(1, "Dog");
        list.add(2, "Hamster");
        list.add(3, "Parrot");
        list.add(4, "Guinea pig");
        list.add(5, "Chicken");
        list.add(6, "Cow");
        list.add(7, "Rabbit");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
    }
}
