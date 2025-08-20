package BaiTap2.B1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Book 1", "Hien"));
        books.add(new Book("Book 2", "Tuan"));
        books.add(new Book("Book 3", "Tung"));
        books.add(new Book("Book 4", "Dung"));

        for(Book b : books) {
            System.out.println(b);
        }
    }
}
