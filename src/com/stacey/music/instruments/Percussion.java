package com.stacey.music.instruments;

public class Percussion extends Instrument {
    public Percussion(int id) {
        super(id);
    }

    public String playNote(char note) {
        return "Percussion №"+id+": "+note;
    }
}
