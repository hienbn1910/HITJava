package BaiTap1.B1;

public class Rectangle extends Shape {
    private double dai;
    private double rong;

    public Rectangle() {

    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double area() {
        return dai * rong;
    }
}
