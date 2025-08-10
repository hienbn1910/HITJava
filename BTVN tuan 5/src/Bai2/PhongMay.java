package Bai2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private ArrayList<May> y;
    private int n;

    public PhongMay() {
        x = new QuanLy();
        y = new ArrayList<>();
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = new ArrayList<May>();
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public ArrayList<May> getY() {
        return y;
    }

    public void setY(ArrayList<May> y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====NHẬP THÔNG TIN PHÒNG MÁY=====");
        System.out.println("Nhập mã phòng máy: ");
        maPhong = sc.nextLine();
        System.out.println("Nhập tên phòng máy");
        tenPhong = sc.nextLine();
        System.out.println("Nhập diện tích phòng: ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        System.out.println("Nhập số máy trong phòng: ");
        // not int
        this.n = sc.nextInt();

        System.out.println();
        System.out.println("===NHẬP THÔNG TIN MÁY===");
        for(int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin máy thứ " + (i + 1));
            May may = new May();
            may.Nhap();
            y.add(may);
            System.out.println();
        }
        System.out.println("===NHẬP THÔNG TIN NGƯỜI QUẢN LÝ===");
        x.Nhap();
        System.out.println();
    }
    void Xuat() {
        System.out.println("=====THÔNG TIN PHÒNG MÁY=====");
        System.out.println("Mã phòng máy: " + maPhong);
        System.out.println("Tên phòng máy: " + tenPhong);
        System.out.println("Diện tích phòng: " + dienTich + "m2");

        System.out.println();
        System.out.println("===THÔNG TIN MÁY===");
        for(int i = 0; i < n; i++) {
            System.out.println("[MÁY " + (i + 1) + "]");
            y.get(i).Xuat();
            System.out.println();
        }
        System.out.println("===THÔNG TIN NGƯỜI QUẢN LÝ===");
        x.Xuat();
    }
}
