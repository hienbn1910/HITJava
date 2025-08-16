package Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien qlNV = new QuanLyNhanVien();

        qlNV.themNhanVien(new NhanVienFullTime("FT01", "Nguyễn Tùng Anh", 30, "ta@gmail.com", "0921738112", 10000, 2000));
        qlNV.themNhanVien(new NhanVienFullTime("FT02", "Lê Văn Sơn", 25, "vs@gmail.com", "09378278112", 5000, 400));

        qlNV.themNhanVien(new NhanVienPartTime("FT01", "Nguyễn Văn Ánh", 20, "va@gmail.com", "0921738112", 50, 20000));
        qlNV.themNhanVien(new NhanVienPartTime("FT02", "Nguyễn Thế An", 18, "ta1@gmail.com", "0927192381", 30, 15000));

        System.out.println("===DANH SÁCH NHÂN VIÊN===");
        qlNV.hienThiTatCa();

        System.out.println("===TỔNG QUỸ LƯƠNG===");
        System.out.println(qlNV.tinhTongLuong());


    }
}
