package HomeWork;

public class Book {

    public static class Title {

        String titleBook = "Eat That Frog! 21 Great Ways to Stop Procrastinating and Get More Done in Less Time";

        public String show() {
            System.out.println(titleBook);
            return "";
        }
    }

    public static class Author {

        String author = "Author of this book is Brian Tracy";

        public String show() {
            System.out.println(author);
            return "";
        }
    }

    public static class Content {

        String content = "Eat That Frog - shows you how to organize each day so you can zero in on these critical tasks and accomplish them efficiently and effectively";

        public String show() {
            System.out.print(content);
            return "";
        }
    }

    public static class BookMain {

        public static void main(String[] args) {
            System.out.println();

            Title title = new Title();
            System.out.print(title.show());

            Author author = new Author();
            System.out.print(author.show());

            Content content = new Content();
            System.out.println(content.show());
        }
    }
}
