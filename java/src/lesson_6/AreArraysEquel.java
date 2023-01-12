package lesson_6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AreArraysEquel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of numbers for first array ");
        int amountArray = input.nextInt();
        int array[] = new int[amountArray];
        System.out.println("Enter amount of numbers for second array ");
        int amountArray2= input.nextInt();
        int array2[] = new int[amountArray2];
        for (int i = 0; i < amountArray; i++) {
            System.out.println("Enter numbers for first array. You need to enter " + (amountArray - i) + " numbers");
            array[i] = input.nextInt();
            if (amountArray == array[i]) {
                System.out.println("Thank you for adding numbers for first array");
            }
        }
        for (int i = 0; i < amountArray2; i++) {
            System.out.println("Enter numbers for second array. You need to enter " + (amountArray2 - i) + " numbers");
            array2[i] = input.nextInt();
            if (amountArray2 == array2[i]) {
                System.out.println("Thank you for adding numbers for second array");
            }
        }
        System.out.println("This two arrays are the same. Is it true?  " + arraysEqual(array, array2));
        System.out.println("This two arrays are the same. Is it true?  " + arraysEqual2(array,array2));
    }

    public static boolean arraysEqual(int [] array1, int [] array2){
        if (Arrays.equals(array1,array2)){
            return true;
        }
        return false;
    }

    public static boolean arraysEqual2(int [] array1, int [] array2){
        return IntStream.range(0, array1.length).noneMatch(i -> array2[i] != array1[i]);
        }
    }

