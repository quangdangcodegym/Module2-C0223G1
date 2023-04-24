package com.codegym.animal_abstract_interface;

public abstract class Animal implements Ediable {
    public abstract void makeSound();

    protected Fruit [] fruits;

    // public abstract void howToEat();


//    @Override
//    public void howToEat() {
//        System.out.println("Cách ăn động vật thì cơ bản là phải ăn chín không là đau bụng");
//    }

    public void showFruits() {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
        }
    }
}
