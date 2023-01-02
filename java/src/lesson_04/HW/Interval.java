package lesson_04.HW;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num>=0 && num<=14) {
            System.out.println("It's interval from 0 to 14.");
        }
        else if (num>=15 && num<=35) {
            System.out.println("It's interval from 15 to 35.");
        }
        else if (num>=36 && num<=50) {
            System.out.println("It's interval from 36 to 50.");
        }
        else if (num>=51 && num<=100) {
            System.out.println("It's interval from 51 to 100.");
        }
        else {
            System.out.println("This number is outside intervals");
        }
        input.close();

    }

}
