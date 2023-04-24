package com.codegym.extends_oop;

public class Rectangle extends Geometric{



    public Rectangle() {


        super("HCN");
    }


    public String getName(){

        return "Rectangle: " + this.getName();
    }

    @Override
    public String toString() {
        return "Tôi là Rectangle đây";
    }

    //    @Override
//    public String toString(){
//        return "Rectangle: " +  this.getName();
//    }
    public static void main(String[] args) {
        // kiểu khai báo: Geometric
        // kiểu  thực tế: Rectangle
        Geometric g1 = new Rectangle();

        Geometric g2 = new Circle(5);




        Rectangle x1 = (Rectangle) g1;


        if (g1 instanceof Rectangle) {
            System.out.println("Là instanceof của Rectangle");
        }
        if (g1 instanceof Geometric) {
            System.out.println("Là instanceof của Geometric");
        }
        if (g1 instanceof Object) {
            System.out.println("Là instanceof của Object");
        }

    }
}
