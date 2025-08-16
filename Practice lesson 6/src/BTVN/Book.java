package BTVN;

public class Book {
    private static int bookId = 1001;
    private int id; //ID rieng cho tung sach
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book() {

    }

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher(publisher.getName(), publisher.getAddress());
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("Unknown", "Unknown");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        Book.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void displayInfo() {
        System.out.println("BookID: " + bookId);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        this.id = ++bookId;
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if(!showPublisher) {
            System.out.println("Publisher: Unknown");
        }
        else {
            System.out.println("Publisher: " + publisher.getName());
            System.out.println("Address: " + publisher.getAddress());
        }
        System.out.println();
    }
}


