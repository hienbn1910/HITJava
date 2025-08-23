package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi kí tự: ");
        String word = sc.nextLine();

        int demNguyenAm = 0;
        int demInHoa = 0;

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            char lower = Character.toLowerCase(c);
            if(lower == 'u' || lower == 'e' || lower == 'o' || lower == 'a' || lower == 'i') {
                demNguyenAm++;
            }

            if(Character.isUpperCase(c)) {
                demInHoa++;
            }
        }

        System.out.println("Số ký tự nguyên âm: " + demNguyenAm);
        System.out.println("Số ký tự in hoa: " + demInHoa);
    }
}
