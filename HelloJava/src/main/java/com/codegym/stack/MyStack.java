package com.codegym.stack;

import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(4);
        queue.add(7);
        queue.add(7);

        //Retrieves and removes the head of this queue,
        // or returns null if this queue is empty.
        queue.poll();
        /**
         Retrieves and removes the head of this queue.
         This method differs from poll only in that it throws
         an exception if this queue is empty.
         */
        queue.remove();

        /**
         Retrieves, but does not remove, the head of this queue,
         or returns null if this queue is empty.
         */
        queue.peek();

        queue.element();
    }

    public void duyetStack() {
        Stack<Integer> stack = new Stack<>();
        stack.add(7);
        stack.add(5);
        stack.add(1);
        stack.add(6);
        for (Integer item : stack) {
            System.out.println(item);
        }
        System.out.println("Duyet bang iterator");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Duyet bang while isEmpty");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public void daonguocMang() {
        Stack<Integer> stack = new Stack<Integer>();
        int [] arr = {3, 7, 6, 1, 5};

        for(int i = 0 ; i<arr.length ; i++){
            stack.push(arr[i]);
        }
        int i = 0;
        while(!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        System.out.println("mang sau khi dao reserve");
        System.out.println(Arrays.toString(arr));
    }

    public void chuyenthanhNhiPhan() {
        int num = 14;
        Stack<Integer> stack=new Stack<>();
        while(num>0){
            stack.push(num%2);
            num/=2;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
