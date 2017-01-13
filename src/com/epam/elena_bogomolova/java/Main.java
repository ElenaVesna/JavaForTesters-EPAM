package com.epam.elena_bogomolova.java;

public class Main {

    public static void main(String[] args) {
        ArrayProcessing arrayActions = new ArrayProcessing();
//        arrayActions.switchPlacesMaxMinusMinPlus();
//        arrayActions.countEvenElements();
//        arrayActions.replaceNegativeElementsByNumber(0);
//        arrayActions.increasePositiveAfterNegative(3);
        arrayActions.differenceMinAverage();
//        arrayActions.oddRepeatingElements();
    }
}

class ArrayProcessing {
    public int[] createArray(int length, int minElement, int maxElement) {
        System.out.println("initial array with " + length + " integer numbers:");
        int[] myArray = new int[length];
//        generate data
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (minElement + Math.random()*(maxElement - minElement + 1));
        }
        printArrayElements(myArray);
        return myArray;
    }

    private void printArrayElements(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i + " element: " + myArray[i]);
        }
        System.out.println();
    }
//     task 1.1
    public void switchPlacesMaxMinusMinPlus() {
        int[] myArray = new ArrayProcessing().createArray(20, -10, 10);
        int maxMinus = myArray[0];
        int positionMaxMinus = 0;
        int minPlus = myArray[0];
        int positionMinPlus = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < 0 && myArray[i] > maxMinus) {
                maxMinus = myArray[i];
                positionMaxMinus = i;
            }
            if (myArray[i] > 0 && myArray[i] < minPlus) {
                minPlus = myArray[i];
                positionMinPlus = i;
            }
        }
        if (maxMinus < 0 && minPlus > 0) {
            myArray[positionMaxMinus] = minPlus;
            myArray[positionMinPlus] = maxMinus;
            System.out.println("minimum positive and maximum negative switched places");
            printArrayElements(myArray);
        } else {
            System.out.println("cannot switch places: no suitable elements");
        }

    }

//     task 1.2
    public void countEvenElements(){
        int[] myArray = new ArrayProcessing().createArray(20, -10, 10);
        int sumEvenElenemts = 0;
        for (int i = 1; i < myArray.length; i += 2) {
            sumEvenElenemts += myArray[i];
        }
        System.out.println("Sum of even elements: " + sumEvenElenemts);
    }

//    task 1.3
    public void replaceNegativeElementsByNumber(int replacingNumber) {
        int[] myArray = new ArrayProcessing().createArray(20, -10, 10);
        System.out.println("\n array without negative elements:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = replacingNumber;
            }
        }
        printArrayElements(myArray);
    }

//    task 1.4
    public void increasePositiveAfterNegative(int multiplier) {
        int[] array = new ArrayProcessing().createArray(20, -10, 10);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < 0 && array[i+1] > 0) {
                array[i+1] *= multiplier;
            }
        }
        System.out.println("every positive element multiplied by 3, if it goes after the negative element");
        printArrayElements(array);
    }

//    task 1.5
    public void differenceMinAverage() {
        int[] array = new ArrayProcessing().createArray(20, -10, 10);
        int minimum = array[0];
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        float average = (float)sum/array.length;
        System.out.println("minimum element in array: " + minimum + ", average: " + average);
        System.out.println("their difference: " + Math.abs((average - minimum)));
    }

//    task 1.6
    public void oddRepeatingElements() {
        int[] array = new ArrayProcessing().createArray(20, -10, 10);
        for (int i = 0; i < array.length; i++) {

        }
    }
}
