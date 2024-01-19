package com.booleanuk.core;

public class PowerSupply {
    private boolean isOn;
    public PowerSupply(){
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }
    public boolean isOn(){
        return isOn;
    }

}
