package lesson_5.collections;

import java.util.ArrayList;

public class CustomerArrayList {
    public static void main(String[] args) {
        ArrayList<Double> myArray = new ArrayList<>();
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            myArray.add(Math.random() * 100);
            System.out.print(myArray.get(i) +" ");

        }
        System.out.println("\nmyArray.size() = " + myArray.size());
        for (double number:myArray) {
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
            sum+=number;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + sum / myArray.size());
        myArray.forEach(number -> System.out.println(number));

    }

    }

