package BaiTap3.B5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean value = false;

        while (!value) {
            try {
                System.out.print("Nhập a: ");
                a = sc.nextInt();

                System.out.print("Nhập b: ");
                b = sc.nextInt();

                try {
                    int c = a / b;
                    System.out.println(c);
                } catch (Exception e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
                value = true;

            } catch (Exception e) {
                System.out.println("Sai định dạng! Vui lòng nhập lại!!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
