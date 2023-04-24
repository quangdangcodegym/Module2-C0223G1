package com.codegym.animal_abstract_interface;

public abstract class Fruit {
    protected String color;
    protected float weight;

    public Fruit(String color, float weight) {
        this.color = color;
        this.weight = weight;
    }
    public Fruit() {

    }

    public abstract float getWeight();

    public String getColor() {
        return color;
    }
}
