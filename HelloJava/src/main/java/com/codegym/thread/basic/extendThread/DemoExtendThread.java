package com.codegym.thread.basic.extendThread;

public class DemoExtendThread {
    public static void main(String[] args) {
        Thread thread1 = new PrintChar1(100, 'a');
        Thread thread2 = new PrintChar1(100, 'b');
        Thread thread3 = new PrintNum1(100);

        thread1.start();

        thread2.start();
        thread3.start();




     }
}
