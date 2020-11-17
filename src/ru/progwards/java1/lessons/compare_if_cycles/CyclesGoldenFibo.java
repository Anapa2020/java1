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
        float f = 0;
        if (a == b)
            f = (float) a / c;
        else if (b == c)
            f = (float) b / a;
        else if (c == a)
            f = (float) c / b;
        return f > 1.61703f && f < 1.61903f;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(12345, 0));
        System.out.println(containsDigit(0, 1));
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(55, 55, 34));
        System.out.println(" 1,1,2,3,5,8,13,21,34,55,89,144,233,377,610 ");
    }


}

