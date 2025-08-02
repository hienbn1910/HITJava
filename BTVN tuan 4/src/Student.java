import java.time.Instant;

public class Student {
    private String name;
    private int namSinh;
    private String diaChi;
    private double tx1;
    private double tx2;
    private double kthp;
    private int soTietNghi;

    public Student(String name, int namSinh, String diaChi, double tx1, double tx2, double kthp, int soTietNghi) {
        this.name = name;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.soTietNghi = soTietNghi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public double diemGPA() {
        return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
    }

    public int getAge() {
        return 2025 - getNamSinh();
    }


}
