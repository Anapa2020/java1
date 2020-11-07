package ru.progwards.java1.lessons.compare_if_cycles;

import com.sun.source.tree.BreakTree;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {

        for (int n = number; n != 0; n /= 10) {
            int dig = n % 10;
            digit = digit * 10 + digit;
        }
        return false;
    }

    public static int fiboNumber(int n){
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo3 = 1;
        for ( int i = 3; i <= n; i++){
            fibo3 = fibo1+fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;

        }
        return fibo3;
    }
    public static boolean isGoldenTriangle(int a, int b, int c){
        if (a == b || a == c){
            return true;
        }else if (a > b || a > c){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(containsDigit(12345,0));
        System.out.println(containsDigit(0,1));
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(7,7,3));
        System.out.println(" 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610 ");
    }


    }

