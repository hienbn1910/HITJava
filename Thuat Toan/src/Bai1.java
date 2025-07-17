import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14;

        double chuVi = r * 2 * pi;
        double dienTich = r * r * pi;

        System.out.printf("%.3f %.3f", chuVi, dienTich);
    }
}