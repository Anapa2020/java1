package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {

    private boolean[] sieve;
    private int N;

    public Eratosthenes(int N) {
        this.N = N;
        sieve = new boolean[N - 1];
        Arrays.fill(sieve, true);
        sift();

    }


    private void sift() {
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i])
                for (int j = 2; i * j < sieve.length; ++j) {
                    sieve[j * i] = false;

                }

        }

    }

    public boolean isSimple(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i< n ; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes(13);
        System.out.println(eratosthenes.isSimple(7));

    }
}