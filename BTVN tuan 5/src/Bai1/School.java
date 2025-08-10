package Bai1;

import java.awt.*;
import java.util.Scanner;

public class School {
    private String name;
    private String date;

    public School(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public School() {

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

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên trường: ");
        name = sc.nextLine();
        System.out.println("Nhập ngày vào trường: ");
        date = sc.nextLine();
    }

    public void Output() {
        System.out.println("Tên trường: " + name);
        System.out.println("Ngày vào trường: " + date);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
