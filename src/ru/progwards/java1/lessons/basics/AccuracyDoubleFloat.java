package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final double PI = 3.14;
    public static final double R = 6371.2;
    public static final double VOLUME = 4 / 3 * PI * (R * R * R);

    public static double volumeBallDouble(double radius){
        return radius;
    }
    public static float volumeBallFloat(float radius){
        return (float) radius;
    }
    public static double calculateAccuracy(double radius){
        return radius;
    }

    public static void main(String[] args) {
        System.out.println("Объём шара с радиусом " + volumeBallDouble(VOLUME));
        System.out.println("Объём шара с радиусом " + volumeBallFloat((float)VOLUME));
        System.out.println("Разницу между функциями volumeBallDouble и volumeBallFloat " + calculateAccuracy(VOLUME-(float)VOLUME));
    }
}

