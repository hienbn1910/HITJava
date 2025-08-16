package Bai2;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime() {

    }

    public NhanVienPartTime(int soGioLam, double luongTheoGio) {
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public NhanVienPartTime(String maNV, String tenNV, int tuoi, String email, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maNV, tenNV, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return this.soGioLam * this.luongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Loại: Part Time");
        super.hienThiThongTin();
    }
}
