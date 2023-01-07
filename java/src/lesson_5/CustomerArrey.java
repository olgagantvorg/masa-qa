package lesson_5;

import java.util.Random;

public class CustomerArrey {
    public static void main(String[] args) {

        Random random = new Random();

        double myArray[]= new double[10];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (1000 * random.nextDouble());
            System.out.println(myArray[i] + " ");
            if (max > myArray[i])
        }


    }
}
