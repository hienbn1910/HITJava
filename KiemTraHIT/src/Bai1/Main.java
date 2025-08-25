package Bai1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();

        boolean check = true;
        String none = " ";
        if(str.equalsIgnoreCase(none)) {
            check = false;
        }

        int space = 0;
        for(char c : str.toCharArray()) {
            if (c == ' '){
                space++;
            }
        }
        System.out.println("Số kí tự khoảng trắng là: " + space);

        String reverseStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);

        }
        System.out.println(reverseStr);
    }
}