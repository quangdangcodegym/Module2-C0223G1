package com.codegym.thread.basic.extendThread;

public class PrintNum1 extends Thread {
    private int num;

    public PrintNum1(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
