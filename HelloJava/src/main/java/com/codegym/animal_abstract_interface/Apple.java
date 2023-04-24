package com.codegym.animal_abstract_interface;

public class Apple extends Fruit{
    @Override
    public float getWeight() {
        return this.weight + 50;
    }

    @Override
    public String toString() {
        return "Táo";
    }
}
