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
        int[] tempArray = new int[array.length +1];
        System.arraycopy(array,0,tempArray,0,2);
        System.arraycopy(array,2,tempArray,3,6);
        tempArray[pos] = num;
        array = tempArray;


    }

    public void atDelete(int pos) {
        int[] tempArray = new int[array.length - 1];
        System.arraycopy(array,0,tempArray,0,2);
        System.arraycopy(array,3,tempArray,2,6);
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

            dIntArray.atInsert(3, 100);
            System.out.println(Arrays.toString(dIntArray.array));

//
//        dIntArray.atDelete(5);
//        System.out.println(Arrays.toString(dIntArray.array));


        }

    }