package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng học sinh:");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            Student st = new Student();
            st.Input();
            students.add(st);
        }

        System.out.println("===THÔNG TIN SINH VIÊN===\n");
        for(int i = 0; i < n; i++) {
            System.out.println("[Sinh viên thứ " + (i + 1) + "]");
            students.get(i).Output();
            System.out.println();
        }
    }
}