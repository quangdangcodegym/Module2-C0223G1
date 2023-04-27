package com.codegym.dsa_trienkhai_danhsach;

import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 5;     // sức chứa
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(8);

        list.remove(2);

        list.printList();
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    /**
     Làm thêm các phương thức:
        1. addAll(Mylist<E> list);
        2. add(int index, E value);
        2. contain(MyList<E> list);
     */

    public void set(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }else {
           elements[index] = value;
        }
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }
    public void printList() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public E get(int index) {
        if (index < 0 || index > size) {
//            throw new IndexOutOfBoundsException();
            return null;
        }
        return (E) elements[index];
    }

    public void remove(int index) {
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size-1] = null;
    }
}
