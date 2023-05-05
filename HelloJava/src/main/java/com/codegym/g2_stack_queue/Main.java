package com.codegym.g2_stack_queue;

import com.codegym.dsa_danhsach.baitap.Rectangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
        List<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();

        List<String> arr2 = new LinkedList<>();
        arr = arr2;

         List<String> arr = new ArrayList<>();
         //Polymorphism is the ability of an object to take on many forms (dịch câu này)
         Set<Integer> danhsach = new HashSet<>();


         Object a = new Rectangle();
         a.toString();       // đa hình  tai thoi diem bien dich
         **/



        /**
        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
            System.out.println(value);
        }
         Stack<Integer> stack = new Stack<>();
         stack.push(1);
         stack.push(5);
         stack.push(7);
         stack.push(9);
         System.out.println("Dung iterator");
         Iterator<Integer> iterator = stack.iterator();
         while (iterator.hasNext()){
         System.out.println(iterator.next());
         }

         System.out.println("Dung for :");
         for (Integer item : stack) {
         System.out.println(item);
         }

         Set<String> lopG2 = new HashSet<>();
         lopG2.add("Nhan");
         lopG2.add("Huy");
         lopG2.add("Nhan");
         for (String i : lopG2) {
         System.out.println(i);
         }

         int [] numbers = {5,1,7,9};     // {9,7,1,5}
         reverse(numbers);
         System.out.println(Arrays.toString(numbers));
         **/

//        int number = 14;
//        System.out.println(toBinary(14));

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(7);
        queue.add(1);
        queue.add(9);

        queue.peek();


    }
    public static void reverse(int[]arr){
        Stack<Integer> stack=new Stack<Integer>();
        for (int number:arr) {
            stack.push(number);
        }
        int i=0;
        while (!stack.isEmpty()){
            arr[i]=stack.pop();
            i++;
        }
    }

    public static String toBinary(int number) {
        Stack<Integer> integers = new Stack<>();

        while (number > 0) {
            integers.push(number % 2);
            number = number/2;
        }

        String str = "";
        while (!integers.isEmpty()) {
            str += integers.pop();
        }
        return str;
    }

}
