package lesson_04;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month 1,2 or 6");
        int month = input.nextInt();

        while (month != 1 && month != 2 && month !=6){
            System.out.println("Enter another number ");
            month = input.nextInt();
        }
        switch (month){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 6:
                System.out.println(6);
                break;
        }
    }
}
