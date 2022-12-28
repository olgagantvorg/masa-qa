package lesson_3;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What month is now?");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("now is January");
                break;
            case 2:
                System.out.println("now is February");
                break;
            case 3:
                System.out.println("now is March");
                break;
            case 4:
                System.out.println("now is April");
                break;
            case 5:
                System.out.println("now is May");
                break;
            case 6:
                System.out.println("now is June");
                break;
            case 7:
                System.out.println("now is July");
                break;
            case 8:
                System.out.println("now is August");
                break;
            case 9:
                System.out.println("now is September");
                break;
            case 10:
                System.out.println("now is October");
                break;
            case 11:
                System.out.println("now is November");
                break;
            case 12:
                System.out.println("now is December");
                break;
            default:
                System.out.println("It is wrong number of month " + month);

        }
        input.close();
    }
}
