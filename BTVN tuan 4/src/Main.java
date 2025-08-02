import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> danhSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        StudentControl.fakeData(danhSach);
//        StudentControl.addStudent(danhSach);
        StudentControl.show(danhSach);
//        StudentControl.editStudentProfiles(danhSach);
//        StudentControl.show(danhSach);
//        StudentControl.descendingAge(danhSach);
//        StudentControl.descendingGPA(danhSach);
//        StudentControl.descendingSoTietNghi(danhSach);
//        StudentControl.deleteStudent(danhSach);
//        StudentControl.show(danhSach);

        int choice = 0;

        do {
            System.out.println();
            System.out.println("===CHỌN CHỨC NĂNG===");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin theo tuổi");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xêp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println();

            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StudentControl.addStudent(danhSach);
                    StudentControl.show(danhSach);
                    break;
                case 2:
                    StudentControl.editStudentProfiles(danhSach);
                    StudentControl.show(danhSach);
                    break;
                case 3:
                    StudentControl.descendingAge(danhSach);
                    StudentControl.show(danhSach);
                    break;
                case 4:
                    StudentControl.descendingGPA(danhSach);
                    StudentControl.show(danhSach);
                    break;
                case 5:
                    StudentControl.descendingSoTietNghi(danhSach);
                    StudentControl.show(danhSach);
                    break;
                case 6:
                    StudentControl.deleteStudent(danhSach);
                    StudentControl.show(danhSach);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lý, vui lòng chọn lại");
            }

        } while(choice != 0);
        sc.close();
    }
}