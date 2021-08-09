package com.stacey.music.instruments;

public abstract class Instrument {

    protected int id;

    public Instrument(int id) {
        this.id = id;
    }

    public void playFragment(String fragment) {
        for (int i = 0; i < fragment.length(); i++) {
            System.out.println( playNote(fragment.charAt(i)) );
        }
    }

    protected abstract String playNote(char note);

    public int getId() {
        return id;
    }
}
