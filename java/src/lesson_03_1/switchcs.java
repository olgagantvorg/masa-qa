package lesson_03_1;

import java.util.Scanner;

public class switchcs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1-3..");
        String numb = input.nextLine();
        switch (numb) {
            case "1":
                System.out.println("Number is 1");
                break;
            case "2":
                System.out.println("Number is 2");
                break;
            case "3":
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Wrong number " + numb);
        }
        input.close();
    }
}


