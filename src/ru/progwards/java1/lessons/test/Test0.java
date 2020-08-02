package ru.progwards.java1.lessons.test;

public class Test0 {
    static int addAsStrings(int n1, int n2){
        String stringResult = String.valueOf(n1) + n2;
        System.out.println("stringResult = " + stringResult);

        return Integer.parseInt(stringResult);
    }

    public static void main(String[] args) {
        addAsStrings(2,1);
        addAsStrings(1,2);
        addAsStrings(0,0);
    }
}

