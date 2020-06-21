package ru.progwards.java1.lessons.test;

public class ReverseDigits {


    public static int reverseDigits(int number) {

        Integer a = number;
        String b = a.toString();

        String reverce = new StringBuilder(b).reverse().toString();

        number = Integer.parseInt(reverce);

        System.out.println(number);

        return number;
    }

}
