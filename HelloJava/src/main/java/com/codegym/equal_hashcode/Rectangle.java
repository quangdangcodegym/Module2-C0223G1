package com.codegym.equal_hashcode;

import com.sun.javafx.css.Combinator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Rectangle extends Geometric implements Comparable<Rectangle>{
    private float width;
    private float height;

    public Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }


    public Rectangle() {


        super("HCN");
    }


    public String getName(){

        return "Rectangle: " + this.getName();
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.width, width) == 0 && Float.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    /**
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }else{
            Rectangle r1 = (Rectangle) obj;
            if (this.width == r1.getWidth() && this.height == r1.getHeight()) {
                return true;
            }else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.height, this.height);
    }
     **/

    public float getArea() {
        return width*height;
    }
    public float getPerimeter(){
        return (width+height)*2;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    //    @Override
//    public String toString(){
//        return "Rectangle: " +  this.getName();
//    }
    public static void main(String[] args) {
        // so sánh địa chỉ mà 2 tham chiếu trỏ tới
        Rectangle g1 = new Rectangle(5, 5);    // g1= 0x32ssss
        Rectangle g2 = new Rectangle(1, 3);     // g2 = 0x66666
        Rectangle g3 = new Rectangle(2, 3);
        Rectangle g4 = new Rectangle(3, 3);
        Rectangle g5 = new Rectangle(4, 3);

        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = g1;
        rectangles[1] = g2;
        rectangles[2] = g3;
        rectangles[3] = g4;
        rectangles[4] = g5;



//        Arrays.sort(rectangles);
//        System.out.println(Arrays.toString(rectangles));

        //
        String action = "AREA";
        Comparator comparator;
        if (action.equals("AREA")) {
           comparator = new ComparatorArea();
        }else {
            comparator = new Comparator<Rectangle>() {
                @Override
                public int compare(Rectangle o1, Rectangle o2) {
                    if (o1.getPerimeter() < o2.getPerimeter()) {
                        return 1;
                    } else if (o1.getPerimeter() == o2.getPerimeter()) {
                        return 0;
                    }else {
                        return -1;
                    }
                }
            };
        }

        Arrays.sort(rectangles, comparator);

        System.out.println(Arrays.toString(rectangles));


    }

//    @Override
//    public int compareTo(Rectangle o) {
//        if (this.getArea() > o.getArea()) {
//            return 1;       // tra ra 1 con so lon hon 0
//        } else if (this.getArea() == o.getArea()) {
//            return 0;
//        }
//        return -1;
//    }
    @Override
    public int compareTo(Rectangle o) {
        if (this.getPerimeter() > o.getPerimeter()) {
            return 1;       // tra ra 1 con so lon hon 0
        } else if (this.getPerimeter() == o.getPerimeter()) {
            return 0;
        }
        return -1;
    }

    /**
    public static void interchangeSort(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length-1; i++) {
            for (int j = i + 1; j < rectangles.length; j++) {
                if (rectangles[i].compareTo(rectangles[j])) {
                    // code doi cho
                }
            }
        }
    }

    public static void interchangeSort(Rectangle[] rectangles, Comparator comparator) {
        for (int i = 0; i < rectangles.length-1; i++) {
            for (int j = i + 1; j < rectangles.length; j++) {
                if (comparator.compare(rectangles[i], rectangles[j])) {
                    // code doi cho
                }
            }
        }
    }
     **/

}
