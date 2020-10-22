package ru.progwards.java1.lessons.test; // Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
// public int sumArrayItems(int[] a)

public class Array {


    public int sumArrayItems(int[] a) {

        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }
}
