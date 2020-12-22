package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

public class DIntArray {

    private int[] array = {};

    public DIntArray() {

    }

    public void add(int num) {
        int[] tempArray = new int[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[array.length] = num;
        array = tempArray;


    }

    public void atInsert(int pos, int num) {
        int[] tempArray = new int[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[pos] = num;
        at(10);

    }

    public void atDelete(int pos) {
        int[] tempArray = new int[array.length - 1];
        System.arraycopy(array, 0, tempArray, 0, tempArray.length);
       // System.arraycopy(array,array.length-1,tempArray,array.length-1,array.length);
        //tempArray[array.length] = pos;
        array = tempArray;

    }

    public int at(int pos) {

        return array[pos];
    }


    public static void main(String[] args) {
        DIntArray dIntArray = new DIntArray();
        dIntArray.add(10);
        dIntArray.add(12);
        dIntArray.add(15);
        dIntArray.add(25);
        System.out.println(Arrays.toString(dIntArray.array));

        dIntArray.atDelete(2);
        System.out.println(Arrays.toString(dIntArray.array));



        DIntArray dIntArray1 = new DIntArray();
        dIntArray1.add(15);
        dIntArray1.add(20);
        dIntArray1.add(15);
        dIntArray1.add(25);
        System.out.println(Arrays.toString(dIntArray1.array));



    }

}