package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else if (c >= a && c >= b) {
            return c;
        }

        return a;
    }
    public static int minSide(int a, int b, int c){
        if (a <= b && a <= c){
            return a;
        }else if (b <= a && b <= c){
            return b;
        }else if (c <= a && c <= b){
            return c;
        }
        return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
           if (a == b && a == c){
               return true;
           }else if (a != b && b != c){
               return false;
           }
           return a == b && a == c;
    }


    public static void main(String[] args) {
        System.out.println(maxSide(7,7,5));
        System.out.println(minSide(7,7,5));
        System.out.println(isEquilateralTriangle(7,7,5));
    }
}