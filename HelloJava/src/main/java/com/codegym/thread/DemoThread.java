package com.codegym.thread;

public class DemoThread {
    private static  int MAX = 100;
    private static int MIN = 10;

    public static void main(String[] args) {


        int[] arr = new int[10000000];
        creatArray(arr);
        System.out.println("Tao mang xong");


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                interchangeSort(arr);           // 16p xong
            }
        });
        thread.start();

        System.out.println("Di nhan tin vs Nhat Thu..............");


    }

    public static void interchangeSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void creatArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(MAX -MIN +1) + MIN);
        }
    }
}
