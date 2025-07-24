import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        int top = 0, bot = n - 1;
        int left = 0, right = n - 1;
        int tmp = 0;
        while(tmp < n * n) {
            // left -> right
            for(int i = left; i <= right; i++) {
                a[top][i] = tmp++;
            }
            top++;

            // top -> bot
            for(int i = top; i <= bot; i++) {
                a[i][right] = tmp++;
            }
            right--;

            // right -> left
            for(int i = right; i >= left; i--) {
                a[bot][i] = tmp++;
            }
            bot--;

            // bot -> top
            for(int i = bot; i >= top; i--) {
                a[i][left] = tmp++;
            }
            left++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int d1 = 0, d2 = 0;
        for(int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - 1 - i];
        }
        int sum = d1 + d2;

        // ma trận lẻ
        if(n % 2 != 0) {
            sum -= a[n / 2][n / 2];
        }
        System.out.println(sum);
    }
}