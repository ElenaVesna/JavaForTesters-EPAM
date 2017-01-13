package com.epam.elena_bogomolova.java;

public class Main {

    public static void main(String[] args) {
        ArrayProcessing arrayActions = new ArrayProcessing();
//        arrayActions.switchPlacesMaxMinusMinPlus();
//        arrayActions.countEvenElements();
//        arrayActions.replaceNegativeByZero();
//        arrayActions.increasePositiveAfterNegative();
//        arrayActions.differenceMinAverage();
        arrayActions.oddRepeatingElements();
    }
}

class ArrayProcessing {
    public int[] createArray(int length) {
        System.out.println("initial array with " + length + " integer numbers:");
        int[] myArray = new int[length];
//        generate data
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random()*21 - 10);
        }
        printArrayElements(myArray);
        return myArray;
    }

    private void printArrayElements(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + " element: " + myArray[i]);
        }
    }
//     task 1.1
    public void switchPlacesMaxMinusMinPlus() {
        int[] myArray = new ArrayProcessing().createArray(20);
        int maxMinus = -11;
        int positionMaxMinus = 0;
        int minPlus = 11;
        int positionMinPlus = 0;
        for (int i = 0; i < 20; i++) {
            if (myArray[i] < 0 && myArray[i] > maxMinus) {
                maxMinus = myArray[i];
                positionMaxMinus = i;
            }
            if (myArray[i] > 0 && myArray[i] < minPlus) {
                minPlus = myArray[i];
                positionMinPlus = i;
            }
        }
        myArray[positionMaxMinus] = minPlus;
        myArray[positionMinPlus] = maxMinus;
        System.out.println("\n minimum positive and maximum negative switched places");
        printArrayElements(myArray);
    }

//     task 1.2
    public void countEvenElements(){
        int[] myArray = new ArrayProcessing().createArray(20);
        int sumEvenElenemts = 0;
        for (int i = 1; i < myArray.length; i = i + 2) {
            sumEvenElenemts = sumEvenElenemts + myArray[i];
        }
        System.out.println("\n" + "Sum of even elements: " + sumEvenElenemts);
    }

//    task 1.3
    public void replaceNegativeByZero() {
        int[] myArray = new ArrayProcessing().createArray(20);
        System.out.println("\n array without negative elements:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = 0;
            }
        }
        printArrayElements(myArray);
    }

//    task 1.4
    public void increasePositiveAfterNegative() {
        int[] array = new ArrayProcessing().createArray(20);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i+1] > 0) {
                array[i+1] = array[i+1]*3;
            }
        }
        System.out.println("\n array where every positive element multiplied by 3, if it goes after the negative element");
        printArrayElements(array);
    }

//    task 1.5
    public void differenceMinAverage() {
        int[] array = new ArrayProcessing().createArray(20);
        int minimum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        int average = sum/array.length;
        System.out.println("minimum element in array: " + minimum + ", average: " + average);
        System.out.println("their difference: " + (average - minimum));
    }

//    task 1.6
    public void oddRepeatingElements() {
        int[] array = new ArrayProcessing().createArray(20);
        for (int i = 0; i < array.length; i++) {

        }
    }
}
