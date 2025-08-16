package Bai2;

import java.util.ArrayList;

public class QuanLyNhanVien {
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public void hienThiTatCa() {
        for(NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
            System.out.println();
        }
    }

    public double tinhTongLuong() {
        double tongLuong= 0;
        for(NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

}
