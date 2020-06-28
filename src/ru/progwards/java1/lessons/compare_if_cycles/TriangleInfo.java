package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {

//    2.1 Реализовать функцию
//    public static boolean isTriangle(int a, int b, int c),
//    которая возвращает true, если по данным трём сторонам (a, b, c)
//    можно построить треугольник. Из геометрии известно,
//    что в треугольнике длина каждой из сторон меньше суммы длин двух других сторон.
//
//2.2 Реализовать функцию
//    public static boolean isRightTriangle(int a, int b, int c),
//    которая возвращает true, если треугольник со сторонами a, b, c является прямоугольным.
//    Из геометрии известно, что для прямоугольного треугольника выполняется
//    теорема Пифагора (сумма квадратов катетов равна квадрату гипотенузы).
//
//            2.3 Реализовать функцию
//    public static boolean isIsoscelesTriangle(int a, int b, int c),
//    которая возвращает true, если треугольник со сторонами a, b, c является равнобедренным.
//    Из геометрии известно, что в равнобедренном треугольнике есть две равные стороны.

    public static boolean isTriangle(int a, int b, int c) {

        boolean isTriangle = false;
        if ((a<(b=c))&&(b<(a+c))&&(c<(a+b))) isTriangle = true;

        return isTriangle;

    }

    public static boolean isRightTriangle(int a, int b, int c) {

        boolean isRightTriangle = false;

        if
        (
                (a*a + b*b) == c*c ||
                        (a*a + c*c) == b*b ||
                        (b*b + c*c) == a*a
        ) isRightTriangle = true;

        return isRightTriangle;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){

        boolean isIsoscelesTriangle = false;

        if ((a==b) || (a==c) || (b==c)) isIsoscelesTriangle = true;

        return isIsoscelesTriangle;

    }

}
