import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; ++i) {
            System.out.printf("5 x %d = %d\n", i, 5 * i);
        }

        int sumFor = 0;

        for(int i = 1; i <= 100; ++i) {
            if (i % 2 == 0) {
                sumFor += i;
            }
        }

        System.out.println("Tổng các số chẵn là: " + sumFor);
        
        int sumWhile = 0;
        int i = 1;
        while(i <= 100) {
            if(i % 2 == 0) {
                sumWhile += i;
            }
            ++i;
        }

        System.out.println("Tổng các số chẵn là: " + sumWhile);
    }
}