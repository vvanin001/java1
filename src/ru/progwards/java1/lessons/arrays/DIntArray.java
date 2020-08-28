package ru.progwards.java1.lessons.arrays;

import tests.test4;

import java.util.Arrays;

public class DIntArray {


    private  int [] numbersFrom = {12,14,15,2,4,8,90};

    DIntArray(){
    }

    //добавление в массив последнего индекса
    public void add(int num){

        numbersFrom = Arrays.copyOf(numbersFrom, numbersFrom.length+1);
        numbersFrom[numbersFrom.length-1]=num;


    }

    //вставить число в массив
    public  void atInsert( int pos, int num) {
        //numbers = new int[numbers.length+1];
        int [] numbersTo = new int[numbersFrom.length+1];

        System.arraycopy(numbersFrom, 0, numbersTo, 0, pos);
        numbersTo[pos] = num;
        System.arraycopy(numbersFrom, pos, numbersTo, pos+1, numbersTo.length - pos-1);

        numbersFrom = Arrays.copyOf(numbersTo, numbersTo.length);

    }


    //удалить число из массива
    public void atDelete(int pos) {


        int [] numbersTo = new int[numbersFrom.length-1];


        System.arraycopy(numbersFrom, 0, numbersTo, 0, pos);

        System.arraycopy(numbersFrom, pos+1, numbersTo, pos, numbersTo.length - pos);


        numbersFrom =  new int[numbersFrom.length-1];
        numbersFrom = Arrays.copyOf(numbersTo, numbersTo.length);

    }

    //    возвращает элемент по индексу pos.
    public int at(int pos) {
        int arrayIntPos = numbersFrom[pos];
        return arrayIntPos;
    }




    public static void main(String[] args) {


        DIntArray arrayTest1 = new DIntArray();
        System.out.println(Arrays.toString(arrayTest1.numbersFrom));
        System.out.println("________________________");

        arrayTest1.add(25);
        System.out.println("add" + Arrays.toString(arrayTest1.numbersFrom));

        arrayTest1.atInsert(5, 5005);
        System.out.println("atInsert" + Arrays.toString(arrayTest1.numbersFrom));

        arrayTest1.atDelete(1);
        System.out.println("atDelete" + Arrays.toString(arrayTest1.numbersFrom));


        System.out.println(arrayTest1.at(1));



    }


}
