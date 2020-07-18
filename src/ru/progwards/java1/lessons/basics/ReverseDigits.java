package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args){
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(321));
        System.out.println(reverseDigits(567));
        System.out.println(reverseDigits(135));
        System.out.println(reverseDigits(351));;
    }
    public static int reverseDigits(int number){
        int a = (number % 10) * 100;
        number = number/10;
        int b = (number % 10) * 10;
        number /= 10;
        return a + b + number;

    }
}
