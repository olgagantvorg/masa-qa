package lesson_2;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < 3 ; i++) {
            double sum = amount*0.1;
            amount-=sum;

        }
        System.out.println(amount);


    }

    }


