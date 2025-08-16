package Bai1;

import java.util.ArrayList;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;

    public SinhVien() {

    }
    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = new LopHoc(lop.getMaLop(), lop.getTenLop());
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public void inThongTin() {
        System.out.println("Ten sinh vien: " + this.hoTen);
        System.out.println("Ma sinh vien: " + this.maSV);
        System.out.println("DiemTB: " + this.diemTB);
        lop.inThongTin();
    }
}
