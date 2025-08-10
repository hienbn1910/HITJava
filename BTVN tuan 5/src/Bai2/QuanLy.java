package Bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public QuanLy() {

    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        maQL = sc.nextLine();
        System.out.println("Nhập họ tên Quản lý: ");
        hoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã người quản lý: " + maQL);
        System.out.println("Họ tên quản lý: " + hoTen);
    }
}
