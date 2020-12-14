package ru.progwards.java1.lessons.arrays;

public class ArraySort {

    public  void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

    }

    public  void main(String[] args) {
        int[] sort_i = {9, 5, 4, 6, 1};
        sort(sort_i);
        for (int i : sort_i) {
            System.out.print(i + " ");
        }

    }
}