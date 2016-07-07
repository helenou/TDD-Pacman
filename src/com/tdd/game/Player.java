package com.tdd.game;

/**
 * Created by lejeuh01 on 06/07/2016.
 */
public class Player {
    int i;
    int j;
    String name;

    public Player(int i, int j) {
    // init a player at location(x,y) set to 0
        this.name= name;
        this.i=i;
        this.j=j;
    }

    public void setLocation(int x, int y){
        i= x;
        j= y;

    }

    public int getXlocation(){

        return i;
    }


    public int getYlocation(){

        return j;
    }

}
