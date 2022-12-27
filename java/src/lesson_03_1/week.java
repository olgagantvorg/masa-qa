package lesson_03_1;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Today is : 1-7 ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is wednesday");
                break;
            case 4:
                System.out.println("Today is thursday");
                break;
            case 5:
                System.out.println("Today is friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                break;
            case 7:
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("Unknown day "+ day);
                break;

        }
        input.close();

    }
}
