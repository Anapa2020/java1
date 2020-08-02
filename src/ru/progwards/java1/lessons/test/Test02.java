package ru.progwards.java1.lessons.test;

public class Test02 {
    static long factorial(long n){
        long resalt = 1;
        for (int i = 1; i <= n; i++){
            resalt = resalt*i;
        }
        return resalt;

    }

    public static void main(String[] args) {
        System.out.println("factorial " + factorial(19));


    }
}

