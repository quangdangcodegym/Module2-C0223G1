package com.codegym.thread.basic.implement_runable;

public class PrintNum implements Runnable{
    private int lastNum;
    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.println(" " + i);
        }
    }

    public PrintNum(int n) {
        lastNum = n;
    }
}
