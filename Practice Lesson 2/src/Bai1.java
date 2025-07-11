// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.printf("Xin chào %s, bạn %d tuổi và cao %.2f mét", name, age, height);
    }
}
