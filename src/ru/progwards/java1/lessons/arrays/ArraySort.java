package ru.progwards.java1.lessons.arrays;

public class ArraySort {


    public static void sort(int[] a){
        int aTemp = 0;
        for (int i = 0; i< a.length; i++){
            for (int j= i+1; j<a.length; j++){
                if (a[i]>a[j]){
                    aTemp = a[i];
                    a[i] = a[j];
                    a[j] = aTemp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("before sort");
        int [] a = {44, 5,8,19, 5,1, 79, 100, 15, 1};

        sort(a);

        System.out.println("after sort");

        for(int c : a){
            System.out.print(c + "; ");
        }


    }


}
