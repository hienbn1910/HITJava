package BaiTap3.B4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Playable> playables = new ArrayList<>();

        playables.add(new Guitar());
        playables.add(new Piano());

        for(Playable p : playables) {
            p.play();
        }
    }
}
