package ru.progwards.java1.lessons.test;

public class Calculator {

    int result;


    public void set(int num){
        result = num;

    }
    public void add(int num){
        result += num;
    }
    public void sub(int num){
        result -= num;
    }
    public  int getResult() {
        return result;
    }

    public static void main(String[] args) {
        System.out.println(2);
    }
}