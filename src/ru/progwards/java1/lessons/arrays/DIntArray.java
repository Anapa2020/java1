package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {

    private int[] array = {};

    public DIntArray() {

    }

    public void add(int num) {
        int[] tempArray = new int[array.length+1];
        System.arraycopy(array,0,tempArray,0,array.length);
        tempArray[array.length] = num;
        array = tempArray;


    }

    public void atInsert(int pos, int num) {
        int[] tempArray = new int[array.length+1];
        System.arraycopy(array,0,tempArray,0,array.length);
        tempArray[pos]=num;

    }

    public void atDelete(int pos) {
        int[] tempArray = new int[array.length-1];
        System.arraycopy(array,0,tempArray,0,tempArray.length);
        System.arraycopy(array,array.length-1,tempArray,array.length-1,array.length);
        tempArray[array.length] = pos;
        array = tempArray;

    }

    public int at(int pos) {

        return array[pos];
    }


    public static void main(String[] args) {
        System.out.println();







    }

}