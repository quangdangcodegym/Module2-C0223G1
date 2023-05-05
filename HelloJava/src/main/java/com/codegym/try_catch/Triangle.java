package com.codegym.try_catch;

import java.util.Scanner;

public class Triangle {
    public static Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;
    private  double c;

    public Triangle(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) {
//            System.out.println("3 cạnh của tam giác phải là số dương");
            throw new TriangleExeption("3 cạnh của tam giác phải là số dương");
        }else{
            if ((a + b <= c) || (b + c) <= a || (a + c) <= b) {
//                System.out.println("2 canh phải lớn hơn cạnh còn lại");
                throw  new TriangleExeption("2 canh phải lớn hơn cạnh còn lại");
            }
        }
    }
    public static void main(String[] args) {
        Triangle triangleExeption = new Triangle(4, 5, -1);
//        boolean checkTriangleContinue = false;
//        do {
//            try {
//                System.out.println("Nhập canh a:");
//                double a = Double.parseDouble(scanner.nextLine());
//
//                System.out.println("Nhập canh b:");
//                double b = Double.parseDouble(scanner.nextLine());
//
//                System.out.println("Nhập canh c:");
//                double c = Double.parseDouble(scanner.nextLine());
//                Triangle t1 = new Triangle(a, b, c);
//
//            } catch (TriangleExeption exeption) {
//                checkTriangleContinue = true;
//                System.out.println("Tam giác không hợp lệ vui lòng nhập lại");
//            } catch (NumberFormatException numberFormatException) {
//                checkTriangleContinue = true;
//                System.out.println("Cạnh của tam giác không hợp lệ");
//            }
//        } while (checkTriangleContinue);


    }
}
