package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static Double sphereSquare(Double r){

        double square = 4*3.14*r*r;
        return square;
    }

    public static Double earthSquare() {
        double earthSquare = 4*3.14*6371.2*6371.2;
        return earthSquare;
    }

    public static Double mercurySquare() {
        double mercurySquare = 4*3.14*2439.7*2439.7;
        return mercurySquare;
    }
    public static Double jupiterSquare() {
        double jupiterSquare = sphereSquare(71492.0);
        return jupiterSquare;
    }
    public static Double earthVsMercury() {
        double earthVsMercury = earthSquare()/mercurySquare();
        return earthVsMercury;
    }
    public static Double earthVsJupiter() {
        double earthVsJupiter = earthSquare()/jupiterSquare();
        return earthVsJupiter;
    }

}
