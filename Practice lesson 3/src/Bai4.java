import java.util.Scanner;

public class Bai4 {
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        for(int i = 2; i <= n; i++) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(fibonacci(i) % 2 != 0) {
                sum += fibonacci(i);
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}