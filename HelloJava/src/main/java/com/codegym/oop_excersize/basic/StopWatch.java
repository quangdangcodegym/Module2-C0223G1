package com.codegym.oop_excersize.basic;

import com.codegym.search.Search;

public class StopWatch {
    private long startTime; // OL - 1681714510563: byte,short,int
    private long endTime;   // OL

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();

        int size = 1000000;
        int[] numbers = Search.createArray(size);

        stopWatch.start();

        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers, 0, numbers.length-1); // 5682-> 5s

//        Search.selectionSort(numbers); // 978842s -> 16phut

        System.out.println("Finish..........");
        stopWatch.stop();
        System.out.println("selectionSort: " + stopWatch.getElapsedTime());
    }

}
