package lesson_5;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[100];
        int val[] = {10,12,15,17};
        System.out.println("val.length = " + val.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
