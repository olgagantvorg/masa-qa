package lesson_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IsNumberExist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myArray = {1,2,3,4,5};
        Integer [] myArray2 = {1,2,3,4,5};
        System.out.println("Please enter your number ");
        int myNumber = input.nextInt();
        System.out.println("myCheckIn(myNumber,myArray) = " + myCheckIn(myNumber, myArray));
        System.out.println("myCheckIn2(myNumber,myArray) = " + myCheckIn2(myNumber, myArray));
        System.out.println("myCheckIn3(myNumber,myArray) = " + myCheckIn3(myNumber,myArray));


    }

    public static boolean myCheckIn(int myValue, int[] array){
        for (int number : array) {
            if (myValue == number){
                return true;
            }

        }
        return false;

    }
    public static boolean myCheckIn2(int myValue, int[] array){
        int findValue = IntStream.range(0,array.length).filter(i -> myValue == array[i]).findFirst().orElse(-1);
        return findValue != -1 ? true :false;
    }

    public static boolean myCheckIn3(int myValue2, int[] array){
//        List<Integer> list = Arrays.asList(array);
//        System.out.println(list);
        int foundedValue  = Arrays.asList(array).indexOf(myValue2);
        return foundedValue != -1;
    }



}

