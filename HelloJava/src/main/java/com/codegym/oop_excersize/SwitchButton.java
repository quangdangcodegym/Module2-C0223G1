package com.codegym.oop_excersize;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {

    }

    public SwitchButton(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void switchOff() {
        this.lamp.turnOf();
        this.status = false;
    }
    public void switchOn() {
        this.lamp.turnOn();
        this.status  = true;
    }

    @Override
    public String toString() {      // chuyển thành chuỗi
        return String.format("SwitchButton status: %s - lamp: %s",
                this.status, this.lamp != null ? this.lamp.getStatus() : "null");
    }

    public static void main(String[] args) {



    }
}
