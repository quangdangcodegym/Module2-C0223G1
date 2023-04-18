package com.codegym.static_oop;

public class Student {
    public int ma;

    public static String tenTruong = "Bách Khoa";


    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();


        System.out.println(Student.tenTruong);

        System.out.println(s1.tenTruong);
    }

    public static void change() {
        tenTruong = "KHOA HOC HUE";
//        ma = 123;

    }
}
