package ru.progwards.java1.lessons.test;


import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArraySort {
        public static int arrayMax(int[] a) {
            if (a.length==0){
                return 0;
            }
            else
            {
                int result = Integer.MIN_VALUE;
                for(int  i=0;  i  <  a.length;  i++)  {
                    if(a[i]  >  result)  result  =  a[i];
                }
                return result;
            }
        }


        public static void main(String[] args) {
            int [] result = {1,-2,0,4,3};
            int [] res = {};
            System.out.println(" Массив до сортировки "+Arrays.toString(result));
            System.out.println(" Массив до сортировки "+Arrays.toString(res));
            System.out.println("Массив до сортировки "+ Arrays.binarySearch(result,3));
            System.out.println("Массив до сортировки "+ Arrays.binarySearch(res,2));
            sort(result);
            sort(res);
            System.out.println(" Массив после сортировки "+Arrays.toString(result));
            System.out.println(" Массив после сортировки "+Arrays.toString(res));
           // System.out.println(" Массив после сортировки "+Arrays.binarySearch(result,1));
            System.out.println(" Массив после сортировки "+ arrayMax(result));
        }

    }

//Тест 6 Правильный ответ метод -> Arrays.sort()
   public int arrayMax(int[] a){
      if (a.length == 0)
        return 0;
    Arrays.sort(a);
    return a[a.length - 1];
}