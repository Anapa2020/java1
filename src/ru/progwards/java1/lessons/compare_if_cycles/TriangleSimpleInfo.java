package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
         if (a >= b && a >= c){
             return a;
         }else if (b >= a && b >= c){
             return b;
         }else if (c >= a && c >= b){
             return c;
         }
        return 0;
    }
    public static int minSide(int a, int b, int c){
        if (a <= b && a <= c){
            return a;
        }else if (b <= a && b <= c){
            return b;
        }else if (c <= a && c <= b){
            return c;
        }
      return 10;
   }
    public static boolean isEquilateralTriangle(int a, int b, int c){
       if (a == b && a == c && b == c){
           return true;
       }else if (a != b & a != c & b != c){
           return false;
       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(2,2,3));
        System.out.println(minSide(2,3,2));
        System.out.println(isEquilateralTriangle(2, 2, 1));
        System.out.println(isEquilateralTriangle(2, 3, 2));
        System.out.println(isEquilateralTriangle(3, 2, 2));
        System.out.println(isEquilateralTriangle(2, 2, 2));
        System.out.println(isEquilateralTriangle(3, 3, 3));
    }
}
