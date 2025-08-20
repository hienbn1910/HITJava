package BaiTap1.B2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movable> moves = new ArrayList<>();

        moves.add(new Car());
        moves.add(new Bike());

        for(Movable a : moves) {
            a.move();
        }
    }
}
