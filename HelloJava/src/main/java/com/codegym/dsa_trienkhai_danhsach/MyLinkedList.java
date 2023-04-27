package com.codegym.dsa_trienkhai_danhsach;

public class MyLinkedList<E> {
    private  Node head;     // null
    private  int numNodes;  // 0

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    /**
     Làm thêm các phương thức:
     1. addLast(E e): void thêm giá trị e vào cuối LinkedList
     2. contains(E e): boolean kiểm tra chứa giá trị e không
     3. indexOf(E e): int lấy vị trí trong LinkedList chứa giá trị e
     */


    private class Node {
        private Node next;  // null
        private Object data;        // nnull

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;

        Node n = new Node(data);
        temp.next = n;
        n.next = holder;
//        temp.next.next = holder;
        numNodes++;
    }


    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList(5);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        myLinkedList.add(1, 10);

    }
}