package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
           public static boolean isTriangle(int a, int b, int c) {
            if (a + b > c && b + c > a && a + c > b){
                return true;
            } else if (a + b < c && b + c < a && a + c < b){
                return false;
            }
            return  a + b > c && b + c > a && a + c > b;
        }
        public static boolean isRightTriangle(int a, int b, int c){
            if (a > b || a < b && a > c || a < c && b > c || b < c){
                return true;
            }else if (a >= b || a <= b && a >= c || a <= c && b >= c || b <= c){
                return false;
            }
            return a > b || a < b && a > c || a < c && b > c || b < c;
        }
        public static boolean isIsoscelesTriangle(int a, int b, int c){
             if (a > b || a < b && a > c || c > a && b > c || b < c){
             return true;
             } else if (a <= b || a <= c && b <= c){
                 return false;
             }
             return true;
        }

        public static void main(String[] args) {
            System.out.println(isTriangle(7,7,5));
            System.out.println(isRightTriangle(7,7,5));
            System.out.println(isIsoscelesTriangle(7,7,5));
        }
    }

