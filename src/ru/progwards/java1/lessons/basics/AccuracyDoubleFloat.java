package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {



    public static double volumeBallDouble(double radius) {
        double volume = (4*3.14*radius*radius*radius)/3;
        return volume;
    }
    public static float volumeBallFloat(float radius){
        float volume = (4*3.14f*radius*radius*radius)/3;
        return volume;
    }
    public static double calculateAccuracy(double radius){
        double calculateAccuracy = volumeBallDouble(radius)- volumeBallFloat((float) radius);
        return calculateAccuracy;
    }


    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy(6371.2));

    }

}
