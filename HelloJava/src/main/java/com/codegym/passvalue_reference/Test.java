package com.codegym.passvalue_reference;

public class Test {
    public static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Test.swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }
}
