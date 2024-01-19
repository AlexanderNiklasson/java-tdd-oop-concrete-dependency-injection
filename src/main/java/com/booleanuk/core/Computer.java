package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames;
    private PowerSupply psu;
    public Computer(PowerSupply psu){
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }
    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        this.installedGames = new ArrayList<>();
        this.installedGames.addAll(preInstalled);
        this.psu = psu;
    }
    public void turnOn() {
        this.psu.turnOn();
    }
    public void turnOff(){
        this.psu.turnOff();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(String game) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }

    public ArrayList<Game> getInstalledGames(){
        return this.installedGames;
    }
}
