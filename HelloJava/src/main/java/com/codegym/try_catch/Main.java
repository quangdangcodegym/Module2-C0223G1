package com.codegym.try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException  {

        basicTryCatchChecked();



    }

    private static void sum(int a, int b) throws LoiChia0Type1, RuntimeException, NumberFormatException,FileNotFoundException{
        if (b == 0) {
//            throw new LoiChia0Type1("Loi chia 0");
            System.out.println("b khong duoc bang khong");
        }else{
            int c = Integer.parseInt("aa"); // throw new NumberFormatExeption();
            File file = new File("./data/product.txt");
            FileReader fileWriter = new FileReader(file);       // throw new  FileNotFoundException()
        }


    }
    /**
     private static void sum(int a, int b) throws LoiChia0{
     if (b == 0) {
     throw new LoiChia0("Loi chia 0");
     }
     }
     private static void sum(int a, int b) throws ArithmeticException{
     int c = a/b; // throw new Arimetic Exception ()
     }
    private static void sum(int a, int b) {
        try {
            int c = a / b;   // throw new Arimetic Exception ()
        } catch (ArithmeticException e) {
            e.getMessage();
        }

    }
     **/

    public static void basicTryCatchChecked() {
        try {
            File file = new File("./data/product.txt");
            FileReader fileWriter = new FileReader(file);
            System.out.println("aaaaaaaaaa");
        } catch (FileNotFoundException fileNotFoundException) {
            // code gi do
//            fileNotFoundException.getMessage();
            System.out.println("File khong ton tai");
            fileNotFoundException.printStackTrace();
        }finally {
            System.out.println("Chay finally");
        }
    }
    public void basicTryCatchUnchecked() {
        try {
            int number = Integer.parseInt(scanner.nextLine());      // aaa
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println(indexOutOfBoundsException.getMessage());
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Chay vao NumberFormatException");

            System.out.println(numberFormatException.getMessage());
        } catch (Exception e) {
            System.out.println("Chay vao Exception");

            System.out.println(e.getMessage());
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
