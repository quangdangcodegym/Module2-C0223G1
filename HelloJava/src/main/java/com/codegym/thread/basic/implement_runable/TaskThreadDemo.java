package com.codegym.thread.basic.implement_runable;

import com.codegym.thread.basic.implement_runable.PrintChar;
import com.codegym.thread.basic.implement_runable.PrintNum;

public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);

        Runnable print100 = new PrintNum(100);
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();

//        int number = 100;
//        int cChar = 'd';
        Thread thread4 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println('d');
                }
            }
        });

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println('e');
                }
            }
        }.start();
    }

}
