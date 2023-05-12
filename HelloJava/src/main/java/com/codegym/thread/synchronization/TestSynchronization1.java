package com.codegym.thread.synchronization;

public class TestSynchronization1 {
    public static void main(String args[]) {
        Table obj = new Table();// tao mot object
        /**
        MyThread1 t1 = new MyThread1(obj);

        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();

         new Thread(){
        @Override
        public void run() {
        obj.printTable(5);
        }
        }.start();
         new Thread(){
        @Override
        public void run() {
        obj.printTable(100);
        }
        }.start();
         **/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printTable(5);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printTable(100);
            }
        });
        t1.start();
        t2.start();


    }
}