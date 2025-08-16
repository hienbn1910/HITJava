package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {
            System.out.println("==========MENU==========");
            System.out.println("1. Nhập sách vào thư viện");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo mã sách và hiển thị kết quả");
            System.out.println("5. Thoát chương trình");

            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.addBook();
//                    library.fakeData();
                    break;
                case 2:
                    library.displayAllBooks();
                    break;
                case 3:
                    library.searchByAuthor();
                    break;
                case 4:
                    System.out.println("Nhập ID cần xóa: ");
                    int bookId = sc.nextInt();
                    library.removeBookById(bookId);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình!!!!");
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ, vui lòng nhập lại!!!");
            }
        } while(choice != 5);

        sc.close();
    }
}
