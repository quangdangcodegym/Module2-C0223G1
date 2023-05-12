package com.codegym.thread.basic.extendThread;

public class PrintChar1 extends Thread{
    private int num;
    private char aChar;

    public PrintChar1(int num, char c) {
        this.num = num;
        this.aChar = c;
    }
    @Override
    public void run() {
        for (int i = 0; i <= num; i++) {
            System.out.println(aChar);
        }
    }
}
