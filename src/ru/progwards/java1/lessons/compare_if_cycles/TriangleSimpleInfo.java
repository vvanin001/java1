package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {


    public static int maxSide(int a, int b, int c){
        int maxSide = 0;
        if (a>b && a>c) maxSide = a;
        else if (b>a && b>c) maxSide = b;
        else if (c>a && c>b) maxSide = c;

        return maxSide;

    }

    public static int minSide(int a, int b, int c){
        int minSide = 0;
        if (a<b && a<c) minSide = a;
        else if (b<a && b<c) minSide = b;
        else if (c<a && c<b) minSide = c;

        return minSide;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean isEquilateralTriangle = false;
        if (a==b && a==c) isEquilateralTriangle = true;

        return isEquilateralTriangle;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(5,66,2));
        System.out.println(minSide(25,2,55));
        System.out.println(isEquilateralTriangle(5,5,5));
    }


}
