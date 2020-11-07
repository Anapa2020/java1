package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if (a + b > c && b + c > a && c + a > b){
            return true;
        }else if (a + b < c && b + c < a && a + c < b){
            return false;
        }

        return a + b > c && b + c > a && c + a > b;
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        if (a > b || a < b && a > c || a < c && b > c || b < c) {
            return true;
        } else if (a >= b || a <= b && a >= c || a <= c && b >= c || b <= c){
            return false;
    }
        return true;

}
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if (a > b || a < b && a > c || c > a && b > c || b < c){
          return true;
        }else if (a <= b || a <= c && b <= c){
            return false;

        }    return false;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(2, 2, 3));
       System.out.println(isTriangle(2, 3, 4));
        System.out.println(isTriangle(3, 2, 5));
        System.out.println(isTriangle(2, 3, 6));
       System.out.println(isTriangle(3, 3, 9));
        System.out.println(isRightTriangle(2, 3, 6));
        System.out.println(isIsoscelesTriangle(2, 2, 3));
        System.out.println(isIsoscelesTriangle(2, 3, 2));
        System.out.println(isIsoscelesTriangle(3, 2, 2));
        System.out.println(isIsoscelesTriangle(2, 2, 2));
        System.out.println(isIsoscelesTriangle(3, 3, 3));
    }
}

