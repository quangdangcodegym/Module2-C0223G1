package com.codegym.try_catch;

import java.util.Scanner;

public class TriangleExceptionNguyen {
    public static Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;
    private  double c;

    public TriangleExceptionNguyen(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("3 cạnh của tam giác phải là số dương");
        }else{
            if ((a + b <= c) || (b + c) <= a || (a + c) <= b) {
                System.out.println("2 canh phải lớn hơn cạnh còn lại");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập canh a:");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập canh b:");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập canh c:");
        double c = Double.parseDouble(scanner.nextLine());
        TriangleExceptionNguyen triangleExceptionNguyen = new TriangleExceptionNguyen(a, b, c);
    }
}
