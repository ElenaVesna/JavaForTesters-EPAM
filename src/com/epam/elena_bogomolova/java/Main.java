package com.epam.elena_bogomolova.java;

public class Main {

    public static void main(String[] args) {
        int[] array = new ArrayProcessing().createArray();
        new ArrayProcessing().countEvenElements(array);
    }
}

class ArrayProcessing {
    public int[] createArray() {
        System.out.println("initial array with 20 integer numbers:");
        int[] myArray = new int[20];
//        generate data and print
        for (int i = 0; i < 20; i++) {
            myArray[i] = (int) (Math.random()*21 - 10);
            System.out.println(i + " element: " + myArray[i]);
        }
        return myArray;
    }

    public void switchPlacesMaxMinusMinPlus() {


    }

    public void countEvenElements(int[] myArray){
        int sumEvenElenemts = 0;
        for (int i = 0; i < 20; i = i + 2) {
            sumEvenElenemts = sumEvenElenemts + myArray[i];
        }
        System.out.println("sum of even elements: " + sumEvenElenemts);
    }

    public void replaceNegativeByZero() {

    }
}
