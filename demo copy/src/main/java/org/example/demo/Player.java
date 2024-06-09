package org.example.demo;

public class Player {
    private int fivesec;
    private int tensec;
    private int fifteensec;

    public Player() {
        fivesec = 0;
        tensec = 0;
        fifteensec = 0;
    }

    public void addFiveSec() {
        fivesec++;
    }

    public void addTenSec() {
        tensec++;
    }

    public void addFifteenSec() {
        fifteensec++;
    }

    public int getFiveSec() {
        return fivesec;
    }

    public int getTenSec() {
        return tensec;
    }

    public int getFifteenSec() {
        return fifteensec;
    }
}
