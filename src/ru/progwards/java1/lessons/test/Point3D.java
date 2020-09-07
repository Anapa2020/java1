package ru.progwards.java1.lessons.test;


public class Point3D extends Point2D{
    int z;

    public Point3D(int x,int y,int z){
        super(x,y);
        this.z = z;

    }
    @Override
    public String toString() {
        return x+","+y+","+z;
    }

}