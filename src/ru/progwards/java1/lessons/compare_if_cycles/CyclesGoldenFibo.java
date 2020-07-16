package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {


    public static boolean containsDigit(int number, int digit) {

        boolean containsDigit = false;
        String digitToString = Integer.toString(number);
        char [] stringToCharArray = digitToString.toCharArray();

        for (int i = 0; i< stringToCharArray.length; i++) {

            int a2 = Character.getNumericValue(stringToCharArray[i]);

            if (a2==digit) containsDigit = true;

        }

        return containsDigit;

    }


    public static int fiboNumber(int n){

        int a1 = 1;
        int a2 = 1;
        int b = 0;
        int fibonachiNumber;

        if (n<=2) fibonachiNumber  = 1;

        else {

            for (int i = 2; i < n; i++) {

                b = a1 + a2;
                a1 = a2;
                a2 = b;

            }

            fibonachiNumber = b;
        }
        return fibonachiNumber;
    }


    public static boolean isGoldenTriangle(int a, int b, int c){

        boolean isGoldenTriangle = false;

        if ((a==b)) {
            if ((1.61703<= (double) a/(double)c && (double)a/(double)c<=1.61903)){
                isGoldenTriangle = true;
            }
        }
        else if ((a==c)){
            if ((1.61703<= (double) a/(double)b && (double)a/(double)b<=1.61903)){
                isGoldenTriangle = true;
            }
        }
        else if ((b==c)) {
            if ((1.61703<= (double) b/(double)a && (double)b/(double)a<=1.61903)){
                isGoldenTriangle = true;
            }
        }

        return isGoldenTriangle;
    }

    public static void main(String[] args) {

    }

}
