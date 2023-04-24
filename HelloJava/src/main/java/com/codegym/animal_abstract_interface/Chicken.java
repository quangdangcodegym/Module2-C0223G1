package com.codegym.animal_abstract_interface;

public class Chicken extends Animal{
    @Override
    public void makeSound() {
        System.out.println("O oo");
    }

    @Override
    public void howToEat() {
        System.out.println("Luộc chấm muối tiêu");
    }
}
