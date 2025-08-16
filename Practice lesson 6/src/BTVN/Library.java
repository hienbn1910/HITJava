package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> dsbook = new ArrayList<>();

    public void addNewBook(Book book) {
        dsbook.add(book);
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số sách cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            System.out.println("Nhập tên sách: ");
            String title = sc.nextLine();
            System.out.println("Nhập tác giả: ");
            String author = sc.nextLine();
            System.out.println("Nhập đơn giá: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập tên nhà xuất bản (nếu không có thì nhập Unknown)");
            String name = sc.nextLine();
            System.out.println("Nhâp địa chỉ nhà xuất bản (nếu không có thì nhập Unknown)");
            String address = sc.nextLine();

            Publisher publisher = new Publisher(name, address);
            Book book = new Book(title, author, price);
            dsbook.add(book);

            System.out.println("Đã thêm sách!!");
        }

    }


    public void fakeData() {
        dsbook.add(new Book("Book 1", "Hien", 5000, new Publisher("NXB VN1", "Bac Ninh")));
        dsbook.add(new Book("Book 2", "Hien", 5000));
        dsbook.add(new Book("Book 3", "Tuan", 2000, new Publisher("NXB VN2", "Ha Noi")));
        dsbook.add(new Book("Book 4", "Phuc", 4000));
    }

    public void displayAllBooks() {
        for(Book book : dsbook) {
            book.displayInfo(true);
        }
    }

    public void searchByAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả cần tìm: ");
        String author = sc.nextLine();
        for(Book book : dsbook) {
            if(author.equalsIgnoreCase(book.getAuthor())) {
                book.displayInfo();
            }
        }
    }

    public void removeBookById(int bookId) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        for (int i = 0; i < dsbook.size(); i++) {
            if (dsbook.get(i).getId() == bookId) { // so sánh ID riêng của sách
                dsbook.remove(i);
                System.out.println("Đã xóa sách có ID: " + bookId);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách có ID: " + bookId);
        }
    }
}
