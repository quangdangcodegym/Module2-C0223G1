package com.codegym.oop_excersize;

public class SwitchManager {
    private SwitchButton[] switchButtons;

    public SwitchManager() {
        ElectricLamp l1 = new ElectricLamp();
        SwitchButton s1 = new SwitchButton();
        s1.connectToLamp(l1);
        s1.switchOn();


        ElectricLamp l2 = new ElectricLamp();
        SwitchButton s2 = new SwitchButton(l2);


        ElectricLamp l3 = new ElectricLamp();
        SwitchButton s3 = new SwitchButton(l3);


        switchButtons = new SwitchButton[3];
        switchButtons[0] = s1;
        switchButtons[1] = s2;
        switchButtons[2] = s3;
    }

    public SwitchManager(SwitchButton[] switchButtons) {
        this.switchButtons = switchButtons;
    }

    public void turnOffSwitches() {
        for (int i = 0; i < switchButtons.length; i++) {
            switchButtons[i].switchOff();
        }
    }

    public void showInfos() {
        for (int i = 0; i < switchButtons.length; i++) {
            System.out.println(switchButtons[i].toString());
        }
    }

    public static void main(String[] args) {
        SwitchManager switchManager = new SwitchManager();
        switchManager.showInfos();
        switchManager.turnOffSwitches();

        System.out.println("Sau khi đi tắt hết");
        switchManager.showInfos();
    }

}
