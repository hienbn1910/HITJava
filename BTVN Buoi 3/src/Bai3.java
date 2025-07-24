import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = (int)(Math.random() * 101);
        int b = (int)(Math.random() * 101);
        int c = (int)(Math.random() * 201);

//      test correct value
//        int a = 1;
//        int b = 1;
//        int c = 2;

        System.out.println("Phép toán của bạn là: ");
        System.out.println(a + " + " + b + " = " + c);

        System.out.println("Dự đoán kết quả của phép toán: (dung / sai)");
        String check = sc.nextLine();

        if(!check.equalsIgnoreCase("dung") && !check.equalsIgnoreCase("sai")) {
            System.out.println("Câu trả lời không hợp lệ!");
        }
        else {
            if(check.equalsIgnoreCase("dung")) {
                if(a + b != c) {
                    System.out.println("Bạn đã dự đoán sai!");
                }
                else {
                    System.out.println("Bạn đã dự đoán đúng!");
                }
            }
            else {
                if(a + b != c) {
                    System.out.println("Bạn đã dự đoán đúng!");
                }
                else {
                    System.out.println("Bạn đã dư đoán sai!");
                }
            }
        }
    }
}