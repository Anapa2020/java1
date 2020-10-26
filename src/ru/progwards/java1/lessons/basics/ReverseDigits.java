package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int n1 =  (number%10) * 100;
        number = number / 10;
        int n2 = (number%10) * 10;
        number /= 10;

        return  n1 + n2 + number;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(456));
        System.out.println(reverseDigits(789));

    }
}
