package com.tdd.game;

/**
 * Created by lejeuh01 on 06/07/2016.
 */


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PacmanTest {

    Pacman playPacman= new Pacman();

    @Test
    public void tickHasChangedOnce(){
        playPacman.movesRight();
        assertThat(playPacman.getPlayer().getXlocation(), is(1));
        playPacman.movesRight();
        assertThat(playPacman.getPlayer().getXlocation(), is(2));

    }


}
