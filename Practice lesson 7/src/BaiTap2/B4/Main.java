package BaiTap2.B4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("sum(2, 3) = " + calculator.sum(2, 3));
        System.out.println("sum(4.5, 7.5) = " + calculator.sum(4.5, 7.5));
        System.out.println("sum(2, 3, 6) = " + calculator.sum(2, 3, 6));
    }
}
