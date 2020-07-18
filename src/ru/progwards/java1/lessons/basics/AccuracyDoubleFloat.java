package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final double EARTH_RADIUS = 6371.2;
    public static final double PI = 3.14;


    public static double volumeBallDouble(double radius) {
        final double VOLUME_BALL = 4.0/3.0 * PI * (EARTH_RADIUS * EARTH_RADIUS * EARTH_RADIUS);
        return VOLUME_BALL;
    }
    public static float volumeBallFloat(float radius){
        final double VOLUME_BALL = 4.0/3.0 * PI * (EARTH_RADIUS * EARTH_RADIUS * EARTH_RADIUS);
        return (float) VOLUME_BALL;
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble(0) - volumeBallFloat(0f);
    }



    public static void main(String[] args) {
        System.out.println(volumeBallDouble(EARTH_RADIUS));
        System.out.println(volumeBallFloat((float) EARTH_RADIUS));

    }
}
