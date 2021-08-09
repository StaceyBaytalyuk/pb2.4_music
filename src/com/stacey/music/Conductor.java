package com.stacey.music;

import com.stacey.music.instruments.Instrument;

import java.util.List;

public class Conductor {
    private List<Fragment> music;
    private List<Instrument> orchestra;

    public Conductor(List<Fragment> music, List<Instrument> orchestra) {
        this.music = music;
        this.orchestra = orchestra;
    }

    // better to do multithreaded & 1 sec. delay
    public void conduct() {
        for (int i = 0; i < music.size(); i++) {
            Fragment fragment = music.get(i);
            if ( orchestra.stream().anyMatch(p -> p.getId() == fragment.getIdInstrument()) ) {
                Instrument instrument = orchestra.stream().filter(p -> p.getId()==fragment.getIdInstrument()).findFirst().get();
                instrument.playFragment(fragment.getMelody());
            } else {
                System.out.println("Can't play, no such instrument");
            }
        }
    }
}
