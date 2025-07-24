import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public static int sumEven(int[] a, int n) {
        int sumE = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                sumE += a[i];
            }
        }
        return sumE;
    }

    public static int sumOdd(int[] a, int n) {
        int sumO = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 != 0) {
                sumO += a[i];
            }
        }
        return sumO;
    }

    public static boolean primeNum(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Tổng các số chẵn trong mảng là: " + sumEven(a, n));
        System.out.println("Tổng các số lẻ trong mảng là: " + sumOdd(a, n));

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(primeNum(i)) count++;
        }
        System.out.println("Số lượng các số nguyên tố trong mảng là: " + count);
    }
}