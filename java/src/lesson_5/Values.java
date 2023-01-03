package lesson_5;

import java.util.Random;

public class Values {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("We have 0 here " + array[i]);
            }
            else {
                System.out.println(array[i] + " is not 0");
            }
            
        }
    }
}
