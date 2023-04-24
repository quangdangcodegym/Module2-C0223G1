package com.codegym.animal_abstract_interface;

public class Tiger extends Animal{

    public Tiger(Fruit [] fruits) {
        this.fruits = fruits;
    }
    public Tiger() {

    }

    @Override
    public void makeSound() {
        System.out.println("GỪ.........");
    }

    @Override
    public void howToEat() {
        System.out.println("Nấu cao");
    }


}
