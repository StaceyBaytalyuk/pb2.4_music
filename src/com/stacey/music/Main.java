package com.stacey.music;

import com.stacey.music.instruments.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        List<Instrument> orchestra = new ArrayList<>();
        orchestra.add(new Percussion(0));
        orchestra.add(new Percussion(1));
        orchestra.add(new Stringed(2));
        orchestra.add(new Stringed(3));
        orchestra.add(new Wind(4));
        orchestra.add(new Wind(5));

        List<Fragment> music = new ArrayList<>();
        music.add(new Fragment(0, 0, "abcde"));
        music.add(new Fragment(2, 2, "poytrw"));
        music.add(new Fragment(4, 4, "a"));
        music.add(new Fragment(4, 4, "o"));
        music.add(new Fragment(1, 8, "mnb"));
        music.add(new Fragment(3, 9, "zxcvb"));
        music.add(new Fragment(5, 12, "dfgh"));

        Conductor conductor = new Conductor(music, orchestra);
        conductor.conduct();
    }
}
