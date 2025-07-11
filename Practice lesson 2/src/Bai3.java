import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = sc.nextInt();
        System.out.printf("Tổng: %d\n", a + b);
        System.out.printf("Hiệu: %d\n", a - b);
        System.out.printf("Tích: %d\n", a * b);
        System.out.printf("Thương: %d\n", a / b);
        System.out.printf("Số dư: %d\n", a % b);
        if (a != b) {
            System.out.println("Hai số này không bằng nhau!!!");
        } else {
            System.out.println("Hai số này bằng nhau!!!");
        }

    }
}
