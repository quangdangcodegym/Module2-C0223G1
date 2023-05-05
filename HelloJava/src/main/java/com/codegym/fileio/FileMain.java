package com.codegym.fileio;

import java.io.*;
import java.util.Arrays;

public class FileMain {
    public static void main(String[] args) throws FileNotFoundException {



        try {
            FileReader fileReader = new FileReader("D:\\codegym.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            /**
            System.out.println((char) bufferedReader.read());
            bufferedReader.read();
            bufferedReader.read();
            System.out.println(bufferedReader.read());

            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.println((char) c);
            }

             String temp;

             while ((temp = bufferedReader.readLine()) != null) {
             System.out.println(temp);
             }
             **/
            char[] cbuff = new char[3];
            String string = "";
            int count = -1;
            while ((count = bufferedReader.read(cbuff)) != -1) {
                System.out.print(Arrays.toString(cbuff));
                for (int i = 0; i < count; i++){
                    string += cbuff[i];
                }
            }
            System.out.println(string);

        } catch (IOException e) {

        }


    }
    public static void basicFileWriter() {
        File file = new File("D:\\codegym.txt");
        if (file.exists()) {
            System.out.println("File đã tồn tại");
        }
        char[] items = {'c', 'o', 'd', 'e', 'g', 'y', 'm'};
        try {
            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("Hello Codegym");
//            fileWriter.write(items, 4, 3);
            fileWriter.write(65);           // 5


            fileWriter.close();
        } catch (IOException ioException) {

        }
    }

    public static void bufferFilerWriter() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\codegym1.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(65);

            bufferedWriter.flush();
        } catch (IOException ioException) {

        }
    }
}
