package com.codegym.loop.javaoverview;

import java.util.Scanner;

public class Java2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String aaa = System.console().readLine();

        System.out.println(aaa);
//        int a = 5;
//        int b = 5;
//        int total = sum(a,b);
//        System.out.println(sum(5,5));
    }

    public static void launcher() {
        boolean checkActionMenu  = true;
        do {
            System.out.println("Danh sách các bài tập: ");
            System.out.println("1. Bài tập kiểm tra số nguyên tố");
            System.out.println("2. Bài tập In ra các số nguyên tố từ 1 đến số đó: ");
            System.out.println("3. Bài tập In hình chữ nhật: ");
            int actionMenu = scanner.nextInt();
            switch (actionMenu) {
                case 1:
                    exercisePrimeView();
                    break;
                case 2:
                    exercisePrintPrimesLessThanNumber();
                    break;
                case 3:
                    exercisePrintRectangle();
                    break;
            }
            System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
            String actionMenuContinue = scanner.nextLine();
            switch (actionMenuContinue) {
                case "Y":
                    checkActionMenu = true;
                    break;
                case "N":
                    checkActionMenu = false;
                    break;
            }
        } while (checkActionMenu);
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            String str = "";
            for (int j = 0; j < height; j++) {
                str += "* ";
            }
            // '\n'
            System.out.println(str);
        }
    }


    /**
     * function sum(a, b){
     * //........ code
     * return a+b;
     * }
     */

    public static int sum(int a, int b) {
        //..............
        return a+b;
    }

    public static void printNNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static boolean isPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void exercisePrimeView() {
        System.out.println("Nhập vào 1 số: ");
        int number = scanner.nextInt();
        boolean check = isPrime(number);
        if (check) {
            System.out.printf("%s là số nguyên tố: ", number);
        }
    }

    public static void exercisePrintPrimesLessThanNumber(){
        System.out.println("Nhập số bạn cần in các số nguyên tố từ 1");
        int number = scanner.nextInt();
        printPrimesLessThanNumber(number);
    }

    public static void exercisePrintRectangle() {
        System.out.println("In hình chữ nhật: ");
        System.out.println("Nhập chiều dài: ");
        int w = scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int h = scanner.nextInt();
        printRectangle(w, h);
    }

    public static void printPrimesLessThanNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
