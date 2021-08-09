package com.stacey.music;

public class Fragment {
    private int idInstrument;
    private int startingSecond;
    private String melody;

    public Fragment(int idInstrument, int startingSecond, String melody) {
        this.idInstrument = idInstrument;
        this.startingSecond = startingSecond;
        this.melody = melody;
    }

    public int getIdInstrument() {
        return idInstrument;
    }

    public int getStartingSecond() {
        return startingSecond;
    }

    public String getMelody() {
        return melody;
    }
}
