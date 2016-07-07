package com.tdd.game;

/**
 * Created by lejeuh01 on 06/07/2016.
 */
public class Pacman {
    Player pacman;


    public Pacman(){
        pacman= new Player(0,0);
    }


    public Player getPlayer(){

//        return new Player(name, 0,0);
        return pacman;
    }

    public void movesRight() {

        pacman.setLocation(pacman.getXlocation()+1, 0);
    }
}
