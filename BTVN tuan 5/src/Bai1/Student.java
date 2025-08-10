package Bai1;

import java.util.Scanner;

public class Student {
    private String name;
    private String cLass;
    private double score;
    private Faculty y;

    public Student() {
        y = new Faculty();
    }
    public Student(String name, String cLass, double score, Faculty y) {
        this.name = name;
        this.cLass = cLass;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcLass() {
        return cLass;
    }

    public void setcLass(String cLass) {
        this.cLass = cLass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.println("Nhập tên lớp: ");
        cLass = sc.nextLine();
        System.out.println("Nhập điểm: ");
        score = sc.nextDouble();
        sc.nextLine();
        y.Input();
    }

    public void Output() {
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + cLass);
        System.out.println("Điểm: " + score);
        y.Output();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cLass='" + cLass + '\'' +
                ", score='" + score + '\'' +
                ", y=" + y +
                '}';
    }
}
