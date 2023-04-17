package com.codegym.oop_excersize;

public class ElectricLamp {
    private boolean status;     // flase

    public ElectricLamp() {
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOf() {
        this.status = false;
    }

    public boolean getStatus() {
        return status;
    }
}
