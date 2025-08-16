package Bai2;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(double luongCoBan, double tienThuong) {
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(String maNV, String tenNV, int tuoi, String email, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNV, tenNV, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.tienThuong;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Loại: Full Time");
        super.hienThiThongTin();
    }
}
