package com.codegym.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new TreeMap<>();

    }

    public static void understandKey() {
        //
        Map<Student, Integer> map = new HashMap<>();


        Student s1 = new Student(1, "Bao thi");
        Student s11 = new Student(1, "Bao thi");

        Student s2 = new Student(2, "Hong Nhung");
        Student s3 = new Student(3, "Phuoc Dat");

        map.put(s1, 1);
        map.put(s11, 10);
        map.put(s2, 2);
        map.put(s3, 3);


        Set<Student> list = map.keySet();
        for(Student key : list){
            System.out.println("key" +key +"value:"  +map.get(key));
        }
    }
    public static void basicMap() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Phuong Long");
        map.put(2, "Hoang Nguyen");
        map.put(3, "Minh nhat");

        Set<Integer> list = map.keySet();
        for(Integer key : list){
            System.out.println("key" +key +"value:"  +map.get(key));
        }
        System.out.println(map.get(2));

        Set<Map.Entry<Integer, String>> entries = map.entrySet();


        for (Map.Entry<Integer,String> entry: entries){
            System.out.println("Value: "+entry.getValue()+" Key: "+entry.getKey());
        }
    }
}
