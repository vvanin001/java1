package ru.progwards.java1.lessons.test;

public class AccuracyDoubleFloat {



    public static double volumeBallDouble(double radius) {
        double volume = (4/3)*3.14*radius*radius*radius;
        return volume;
    }
    public static float volumeBallFloat(float radius){
        float volume = (4/3)*3.14f*radius*radius*radius;
        return volume;
    }
    public static double calculateAccuracy(double radius){
        double calculateAccuracy = volumeBallDouble(radius)/volumeBallFloat((float) radius);
        return calculateAccuracy;
    }

}
