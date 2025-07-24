import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str.trim();

        // Đảo ngược chuỗi
        String reverseStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        if(!str.equalsIgnoreCase(reverseStr)) {
            System.out.println("Chuỗi này không phải chuỗi đối xứng");
        }
        else {
            System.out.println("Chuỗi này là chuỗi đối xứng");
        }
        System.out.println("Chuỗi đảo ngược là: " + reverseStr);
    }
}