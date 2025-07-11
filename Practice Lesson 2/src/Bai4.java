import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000];

        for(int i = 0; i < 5; ++i) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Các phần tử vừa nhập: ");
        for(int i = 0; i < 5; ++i) {
            System.out.print(a[i] + " ");
        }

        int sum = 0;
        for(int i = 0; i < 5; ++i) {
            sum += a[i];
        }
        System.out.println("\nTổng các phần tử vừa nhập là: " + sum);

        int max = 0;
        for(int i = 0; i < 5; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.print("Gía trị lớn nhất của mảng là: " + max);
    }
}