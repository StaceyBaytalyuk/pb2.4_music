package com.stacey.music.instruments;

public class Wind extends Instrument {
    public Wind(int id) {
        super(id);
    }

    public String playNote(char note) {
        return "Wind №"+id+": "+note;
    }
}
