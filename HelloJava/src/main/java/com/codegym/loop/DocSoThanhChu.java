package com.codegym.loop;

public class DocSoThanhChu {
    public static void main(String[] args) {

    }
    public static String numberToWord(int number) {
        String word = "";
        if (number < 0 || number > 999) {
            word = "out of ability";
        } else if (number < 10) {
            switch(number) {
                case 0:
                    word = "zero";
                    break;
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;
                case 3:
                    word = "three";
                    break;
                case 4:
                    word = "four";
                    break;
                case 5:
                    word = "five";
                    break;
                case 6:
                    word = "six";
                    break;
                case 7:
                    word = "seven";
                    break;
                case 8:
                    word = "eight";
                    break;
                case 9:
                    word = "nine";
                    break;
            }
        } else if (number < 20) {
            int ones = number % 10;
            switch(ones) {
                case 0:
                    word = "ten";
                    break;
                case 1:
                    word = "eleven";
                    break;
                case 2:
                    word = "twelve";
                    break;
                case 3:
                    word = "thirteen";
                    break;
                case 4:
                    word = "fourteen";
                    break;
                case 5:
                    word = "fifteen";
                    break;
                case 6:
                    word = "sixteen";
                    break;
                case 7:
                    word = "seventeen";
                    break;
                case 8:
                    word = "eighteen";
                    break;
                case 9:
                    word = "nineteen";
                    break;
            }
        } else if (number < 100) {
            int tens = number / 10;         // hàng chục
            int ones = number % 10;
            switch(tens) {
                case 2:
                    word = "twenty";
                    break;
                case 3:
                    word = "thirty";
                    break;
                case 4:
                    word = "forty";
                    break;
                case 5:
                    word = "fifty";
                    break;
                case 6:
                    word = "sixty";
                    break;
                case 7:
                    word = "seventy";
                    break;
                case 8:
                    word = "eighty";
                    break;
                case 9:
                    word = "ninety";
                    break;
            }
            if (ones != 0) {
                word += " " + numberToWord(ones);           //numberToWord(1)
            }
        } else {
            // number: 771: seven hundred and seventy one
            int hundreds = number / 100;    // 7
            int remainder = number % 100;   // 71
            word = numberToWord(hundreds) + " hundred";
            if (remainder != 0) {
                word += " and " + numberToWord(remainder);
            }
        }
        return word;
    }
}
