import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();

        String reverseStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        if(!str.equalsIgnoreCase(reverseStr)) {
            System.out.println(reverseStr.toLowerCase());
            System.out.println("Chuỗi này không đối xứng!");
        }
        else {
            System.out.println(reverseStr.toUpperCase());
            System.out.println("Chuỗi này đối xứng!");
        }
    }
}