package lesson_16.book_hw;

import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(123, "How to catch a fly?", "Eitan Bellin"));
        books.add(new Book(123, "How to catch a fly?", "Eitan Bellin"));
        books.add(new Book(234, "Outliers", "Aviad Vaknin"));
        books.add(new Book(234, "Outliers", "Shimon"));
        books.add(new Book(345, "This or that", "Shimon"));
        books.add(new Book(345, "Catcher in the rye", "Daniel"));

        Book testBook = new Book(123, "How to catch a fly?", "Eitan Bellin");

        System.out.println("Total similar books: " + books.stream().filter(b -> b.equals(testBook)).count());
        books.stream().filter(b -> b.equals(testBook)).forEach(System.out::println);
    }
}
