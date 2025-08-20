package BaiTap1.B1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(3.5, 5.5);

        for(Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}