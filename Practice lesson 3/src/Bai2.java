import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159265;

        System.out.println("Nhập bán kính r: ");
        double r = sc.nextDouble();
        System.out.println("Nhập số mũ k: ");
        int k = sc.nextInt();

        double C = 2 * PI * r;
        double S = PI * r * r;

        System.out.println("Chu vi hình tròn là: " + C);
        System.out.println("Diện tích hình tròn là: " + S);
        System.out.println("r mũ k = " + (double)Math.pow(r, k));
        System.out.println("Căn bậc hai của (r + k) là: " + (double)Math.sqrt(r + k));
        System.out.println("Giá trị tuyệt đối của (r - k) là: " + (double)Math.abs(r - k));
    }
}