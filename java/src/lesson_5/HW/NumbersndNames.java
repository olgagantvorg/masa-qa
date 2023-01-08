package lesson_5.HW;

import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class NumbersndNames {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int size = 10;
        for (int i = 0; i <= size; i++) {
            numbers.add(input.nextInt());
        }
        System.out.println("numbers = " + numbers);


    }
}
