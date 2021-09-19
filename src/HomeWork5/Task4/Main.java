package HomeWork5.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(0, 16);
        list.add(1, 12);
        list.add(2, 19);
        list.add(3, 13);
        list.add(4, 14);
        list.add(5, 20);
        list.add(6, 10);
        list.add(7, 17);
        list.add(8, 11);
        list.add(9, 15);

        Collections.sort(list);
        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();
        ListIterator<Integer> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Isn't palindrome");
        }
    }
}
