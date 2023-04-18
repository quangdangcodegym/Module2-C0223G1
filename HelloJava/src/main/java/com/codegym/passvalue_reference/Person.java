package com.codegym.passvalue_reference;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Phương Long");
        Person p2 = new Person("Duy Long");

        Person.swap(p1, p2);

        System.out.println(p1);
        System.out.println(p2);
    }

    public static void swap(Person  a, Person b) {
        String temp = a.name;

        a.name = b.name;
        b.name = temp;
    }
}
