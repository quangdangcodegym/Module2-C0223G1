package com.codegym.equal_hashcode;

import java.util.Comparator;

public class ComparatorArea implements Comparator<Rectangle> {
//    @Override
//    public int compare(Rectangle o1, Rectangle o2) {
//        if (o1.getArea() > o2.getArea()) {
//            return 1;
//        } else if (o1.getArea() == o2.getArea()) {
//            return 0;
//        }else {
//            return -1;
//        }
//    }
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getPerimeter() > o2.getPerimeter()) {
            return 1;
        } else if (o1.getPerimeter() == o2.getPerimeter()) {
            return 0;
        }else {
            return -1;
        }
    }
}
