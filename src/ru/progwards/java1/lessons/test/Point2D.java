package ru.progwards.java1.lessons.test;


public class Point2D {
    int x;
    int y;

    public Point2D(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    @Override
    public String toString() {
        return x+","+y;
    }

}