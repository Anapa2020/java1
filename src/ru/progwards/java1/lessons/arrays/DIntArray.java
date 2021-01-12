package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;
import java.util.List;

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
        int[] tempArray = new int[array.length +1];
        System.arraycopy(array,0,tempArray,0,array.length);
        for (int i = array.length; i > pos; --i) {
            tempArray[i] = tempArray[i-1];

        }
        tempArray[pos] = num;
        array = tempArray;


    }

    public void atDelete(int pos) {
        int[] tempArray = new int[array.length - 1];
        for (int i = 0; i < pos; i++)
            tempArray[i] = array[i];
        for (int i = pos + 1; i <array.length ; i++)
            tempArray[i - 1] = array[i];

        array = tempArray;

    }
        public int at ( int pos){

            return array[pos];
        }


        public static void main (String[]args){
            DIntArray dIntArray = new DIntArray();
            dIntArray.add(10);
            dIntArray.add(15);
            dIntArray.add(25);
            dIntArray.add(35);
            dIntArray.add(45);
            dIntArray.add(55);
            dIntArray.add(65);
            dIntArray.add(75);

            System.out.println(Arrays.toString(dIntArray.array));

            dIntArray.atInsert(6, 100);
            System.out.println(Arrays.toString(dIntArray.array));


        dIntArray.atDelete(6);
        System.out.println(Arrays.toString(dIntArray.array));


        }

    }