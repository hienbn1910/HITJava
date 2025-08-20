package BaiTap3.B3;

public class Circle extends Shape {
    private double r;
    private final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        System.out.print("Diện tích hình tròn là: ");
        return r * r * PI;
    }
}
