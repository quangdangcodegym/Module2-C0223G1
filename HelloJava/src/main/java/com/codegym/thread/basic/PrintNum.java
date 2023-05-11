package com.codegym.thread.basic;

public class PrintNum implements Runnable{
    private int lastNum;
    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }

    public PrintNum(int n) {
        lastNum = lastNum;
    }
}
