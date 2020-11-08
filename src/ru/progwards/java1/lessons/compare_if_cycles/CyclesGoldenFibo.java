package ru.progwards.java1.lessons.compare_if_cycles;

import com.sun.source.tree.BreakTree;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        if (number == 0 && digit == 0) {
            return true;
        }
        int i = number;
        while (i > 0) {
            if (i % 10 == digit) {
                return true;
            } else
                i /= 10;
        }
        return false;
    }

    public static int fiboNumber(int n) {
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo3 = 1;
        for (int i = 3; i <= n; i++) {
            fibo3 = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;

        }
        return fibo3;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
      int i1 = a;
      int i2 = b;
      int i3 = c;
        for (int i = 3; i <= i1 + i2 + i3; i++){
            i3 = i1 + i2;
            i1 = i2;
            i2 = i3;
            return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(12345,0));
        System.out.println(containsDigit(0,1));
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(34,34,55));
        System.out.println(" 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610 ");
    }


    }

