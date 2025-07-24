import java.util.Scanner;

public class Bai1 {
    public static final String square = "Square";
    public static final String triangle = "Triangle";
    public static final String circle = "Circle";
    public static final double pi = 3.14159265;

    public static double squareDT(double d) {
        return d * d;
    }

    public static double circleDT(double r) {
        return pi * r * r;
    }

    public static double triangleDT(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập hình dạng: ");
        String type = sc.nextLine();

        if(type.equalsIgnoreCase(square)) {
            System.out.println("Nhập cạnh của hình vuông: ");
            double d = sc.nextDouble();
            System.out.println("Diện tích hình vuông là: " + squareDT(d));
        }
        else if(type.equalsIgnoreCase(triangle)) {
            System.out.println("Nhập 3 cạnh của tam giác");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if((a + b) <= c || (a + c) <= b || (b + c) <= a) {
                System.out.println("Tam giác này không hợp lệ!!");
            }
            else {
                System.out.println("Diện tích tam giác là: " + triangleDT(a, b, c));
            }
        }
        else if(type.equalsIgnoreCase(circle)) {
            System.out.println("Nhập bán kính của hình tròn: ");
            double r = sc.nextDouble();
            System.out.println("Diện tích hình tròn là: " + circleDT(r));
        }
        else {
            System.out.println("Hình dạng không hợp lệ!!!");
        }
    }
}