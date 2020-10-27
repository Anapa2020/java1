package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final double PI = 3.14;
    public static final double R = 6371.2;


    public static double volumeBallDouble(double radius){
        final double VOLUME = 4.0 / 3.0 * PI * (radius * radius * radius);
        return VOLUME;
    }
    public static float volumeBallFloat(float radius){
        final double VOLUME = 4.0 / 3.0 * PI * (radius * radius * radius);
        return (float) VOLUME;
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble(radius)-volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        calculateAccuracy(R);
        System.out.println(volumeBallDouble(R));
        System.out.println(volumeBallFloat((float)R));

    }
}

