package BaiTap3.B3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3.5, 2.5);

        for(Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
