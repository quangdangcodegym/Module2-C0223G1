package com.codegym.string;

public class Main {
    public static void main(String[] args) {

        String str = "Hello";
        str += "Quang";


        String a1 = "Hello";

        StringBuilder b = new StringBuilder("Hello");
        b.append("Quang");

    }
    public static void basicString() {
        String message = "   Hello     ";

        String message1 = "Hello";

        String message2 = new String("Hello");

        StringBuilder stringBuilder = new StringBuilder("Hello");
        String message3 = stringBuilder.toString();



        if (message == message3) {
            System.out.println("2 chuôi bang nhau");
        }
    }


}
