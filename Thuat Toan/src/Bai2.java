import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 != 0) {
                int left = (i > 0) ? a[i - 1] : 0;
                int right = (i < n - 1) ? a[i + 1] : 0;
                a[i] += Math.abs(left - right);
            }
        }
        for(int i : a) {
            System.out.printf(i + " ");
        }
    }
}