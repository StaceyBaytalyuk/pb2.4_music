package com.stacey.music.instruments;

public class Stringed extends Instrument {
    public Stringed(int id) {
        super(id);
    }

    public String playNote(char note) {
        return "Stringed №"+id+": "+note;
    }
}
