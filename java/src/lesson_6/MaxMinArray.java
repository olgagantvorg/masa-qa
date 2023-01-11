package lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MaxMinArray {
    public static void main(String[] args) {
        Random random = new Random();
        double[] newArray = new double[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (random.nextDouble() * 100);
            System.out.println(newArray[i]);
        }
        System.out.println("getMinValue(newArray) = " + getMin(newArray));
        System.out.println("getMaxValue(newArray) = " + getMax(newArray));
        System.out.println("average(newArray) = " + average(newArray));


    }


    public static double getMin(double[] myArray) {
        double min = Double.MAX_VALUE;
        double max = Double.MAX_VALUE;
        for (double num : myArray) {
            if (min > num) {
                min = num;
            }

        }
        return min;
    }
    public static double getMax(double[] myArray){
        Arrays.sort(myArray);
        return myArray[myArray.length - 1];
    }

    public static double average(double[] myArray){
      double sum = 0;
        for (double count : myArray) {
            sum+= count;
        }
//        return sum / myArray.length;
        return Arrays.stream(myArray).average().getAsDouble();
    }
}



