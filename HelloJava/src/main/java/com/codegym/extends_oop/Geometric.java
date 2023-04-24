package com.codegym.extends_oop;

public class Geometric{
    protected String name;

    public Geometric() {
    }

    public Geometric(String name) {
        this.name = name;
    }
    public String getName(){
        return "Geometric: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tôi là Geometric";
    }
}
