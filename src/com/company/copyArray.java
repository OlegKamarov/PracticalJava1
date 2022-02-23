package com.company;

public class copyArray {
    public static void main(String[] args) {
    int[] arrayA = new int[]{1,2,3,4,5};
    int[] arrayB = new int[5];


    arrayB = arrayA;
    arrayB[1] = 72;

    for (int i = 0; i < 5; i++) {
        System.out.println(arrayA[i]);
        }


        }

    }

