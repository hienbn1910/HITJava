package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        StudentManager studentManager = new StudentManager();
        int choice = 0;

        do {
            System.out.println();
            System.out.println("===== QUẢN LÝ HỌC SINH =====");
            System.out.println("1. In danh sách học sinh");
            System.out.println("2. Sắp xếp theo điểm giảm dần");
            System.out.println("3. Sắp xếp theo điểm tăng dần");
            System.out.println("4. Tìm học sinh theo tên");
            System.out.println("5. Thoát");

            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    studentManager.fakeData();
                    System.out.println("===== DANH SÁCH HỌC SINH =====");
                    studentManager.printStudents();
                    break;
                case 2:
                    studentManager.sortByScoreDesc();
                    System.out.println("===== DANH SÁCH HỌC SINH SAU KHI SẮP XẾP GIẢM DẦN =====");
                    studentManager.printStudents();
                    break;
                case 3:
                    studentManager.sortByScoreAsc();
                    System.out.println("===== DANH SÁCH HỌC SINH SAU KHI SẮP XẾP TĂNG DẦN =====");
                    studentManager.printStudents();
                    break;
                case 4:
                    System.out.println("Nhập tên cần tìm: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    if(studentManager.findByName(name) != null) {
                        System.out.println("Đã tìm thấy!!!");
                        System.out.println(studentManager.findByName(name));
                    }
                    else {
                        System.out.println("Không tìm thấy!!!");
                    }

                    break;
                case 5:
                    System.out.println("ĐÃ THOÁT CHƯƠNG TRÌNH!!!!");
            }

        } while(choice != 5);
    }
}
