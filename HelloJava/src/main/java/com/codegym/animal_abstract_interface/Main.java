package com.codegym.animal_abstract_interface;

public class Main {
    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        Animal a1 = new Tiger(fruits);

        a1.showFruits();






    }
}
