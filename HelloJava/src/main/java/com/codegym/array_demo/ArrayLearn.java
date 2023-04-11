package com.codegym.array_demo;

public class ArrayLearn {
    public static void main(String[] args) {


        /**
         int a = 5;
         myList: biến mảng, biến tham chiếu
         double []: Kiểu dữ liệu mảng các số double
         new double[5]: đối tượng mảng có 5 phần tử
         int [] myList = new int[5];


         // them phan tu vao mang
        int[] myList = {5, 0, 7, 1, 3};        // khởi tạo nhanh 1 mảng 5 phần tử
        myList = addElement(8, myList);

        System.out.println(arrayToString(myList));

         // Xoa 1 phan tu khoi mang
         int[] myList = {5, 0, 7, 1, 3};
         myList = removeElement(0, myList);

         System.out.println(arrayToString(myList));

         **/



    }

    public static int [] removeElement(int index, int[] numbers) {
        int[] newList = new int[numbers.length - 1];
        for (int i=0, k=0; i < numbers.length; i++) {
            if (i == index) {
                continue;
            }
            newList[k] = numbers[i];
            k++;
        }
//        for (int i = 0; i <= index - 1; i++) {
//            newList[i] = numbers[i];
//        }
//        for (int i = index + 1; i < numbers.length; i++) {
//            newList[i-1] = numbers[i];
//        }
        return newList;
    }
    public static int [] addElement(int value, int[] numbers) {
        int[] newList = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newList[i] = numbers[i];
        }
        newList[newList.length - 1] = value;

        return newList;

    }
    public static String arrayToString(int[] numbers) {
        String str = "[";
        for (int i = 0; i < numbers.length; i++) {
            str += numbers[i];
            if (i < numbers.length - 1) {
                str += ", ";
            } else {
                str += "]";
            }
        }
        return str;
    }
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void moveMaxValueToFirst(int[] numbers) {
        int max = numbers[0];
        int indexMax = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                indexMax = i;
            }
        }
        int temp = numbers[0];
        numbers[0] = max;
        numbers[indexMax] = temp;
    }

    public static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}
