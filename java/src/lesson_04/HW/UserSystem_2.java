package lesson_04.HW;

import java.util.Scanner;

public class UserSystem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "Admin";
        String password = "P@ssword";
        for (int i = 5; i >= 1; i--) {
            System.out.println("Enter your name: ");
            String yourName = input.nextLine();
            if (yourName.equalsIgnoreCase(userName)) {
                for (int j = 5; j >= 1; j--) {
                    System.out.println("Enter your pass: ");
                    String yourPass = input.nextLine();
                    if (password.equals(yourPass)) {
                        System.out.println("Welcome to personal section!");
                        return;
                    }
                    else {
                        System.out.println("Sorry, try again . You have " + (j-1) + " attemps to enter password.");
                    }
                }

            }
            else {
                System.out.println("Sorry, try again . You have " + (i-1) + " attemps to enter name.");
            }
                }
        input.close();

    }
}
