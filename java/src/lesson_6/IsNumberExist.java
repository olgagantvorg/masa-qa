package lesson_6;

import java.util.Scanner;

public class IsNumberExist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myArray[] = {1,2,3,45};

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
        for (int number : array) {
            if (myValue == number){
                return true;
            }

        }
        return false;


}

