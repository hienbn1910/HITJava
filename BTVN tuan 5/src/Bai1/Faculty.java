package Bai1;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School x;

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public Faculty() {
        x = new School();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngành đăng ký: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày vào ngành: ");
        date = sc.nextLine();
        x.Input();
    }

    void Output() {
        System.out.println("Ngành học: " + name);
        System.out.println("Ngày vào ngành: " + date);
        x.Output();
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", x=" + x +
                '}';
    }

}


