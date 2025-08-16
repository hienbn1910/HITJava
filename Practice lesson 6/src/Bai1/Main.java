package Bai1;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> students = new ArrayList<>();


        students.add(new SinhVien("1001", "Hien", 8.5, new LopHoc("2001", "KTPM")));
        students.add(new SinhVien("1002", "Tuan", 7.0, new LopHoc("3001", "KTPM")));
        students.add(new SinhVien("1003", "Hung", 9.0, new LopHoc("4001", "KTPM")));
        students.add(new SinhVien("1004", "Van", 9.5, new LopHoc("5001", "KTPM")));
        students.add(new SinhVien("1005", "Ha", 6.5, new LopHoc("6001", "KTPM")));

        System.out.println("===DANH SÁCH SINH VIÊN===");
        for(int i = 0; i < students.size(); i++) {
            students.get(i).inThongTin();
            System.out.println();
        }

        SinhVien topSV = students.get(0);
        for(SinhVien sv : students) {
            if(sv.getDiemTB() > topSV.getDiemTB()) {
                topSV = sv;
            }
        }
        System.out.println("Sinh viên có điểm TB cao nhất là ");
        topSV.inThongTin();
    }
}