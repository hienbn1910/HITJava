import java.util.Scanner;

public class Bai6 {
    static class Student {
        String name;
        int age;
        double gpa;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] st = new Student[n];

        for(int i = 0; i < n; ++i) {
            st[i] = new Student();
            System.out.println("---Nhập sinh viên thứ " + (i + 1) + "---");
            System.out.println("Nhập tên sinh viên: ");
            st[i].name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            st[i].age = sc.nextInt();
            System.out.println("Nhập điểm GPA: ");
            st[i].gpa = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }

        System.out.println("--- Danh sách sinh viên ---");

        for(int i = 0; i < n; ++i) {
            System.out.println("-" + (i + 1) + "- Họ Tên: " + st[i].name);
            System.out.println("    Tuổi: " + st[i].age);
            System.out.println("    GPA: " + st[i].gpa);
        }

        double sum = 0;
        for(int k = 0; k < n; ++k) {
            sum += st[k].gpa;
        }

        double avg = sum / n;
        System.out.printf("Điểm trung bình của cả lớp: %.2f\n", avg);
        double max = 0;
        String maxName = null;

        for(int i = 0; i < n; ++i) {
            if (st[i].gpa > max) {
                max = st[i].gpa;
                maxName = st[i].name;
            }
        }

        System.out.println("Sinh viên có điểm trung bình cao nhất là: " + maxName);
    }

}
