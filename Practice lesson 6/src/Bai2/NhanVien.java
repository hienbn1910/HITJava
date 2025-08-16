package Bai2;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public NhanVien() {

    }
    public NhanVien(String maNV, String tenNV, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double tinhLuong() {
        return 0;
    }
    public void hienThiThongTin() {
        System.out.println("Mã nhân viên: " + this.maNV);
        System.out.println("Tên nhân viên: " + this.tenNV);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Email: " + this.email);
        System.out.println("Số điện thoại: " + this.soDienThoai);
    }
}
