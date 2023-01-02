package lesson_04.HW;

import java.util.Scanner;

public class UserSystem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "Admin";
        String password = "P@ssword";
        int tries = 0;
        int triesPass = 0;
        while (tries < 5) {
            System.out.println("Enter your name: ");
            String yourName = input.nextLine();
            if (yourName.equalsIgnoreCase(userName)) {
                System.out.println("Enter your pass: ");
                while (triesPass < 5) {
                    String yourPass = input.nextLine();
                    if (password.equalsIgnoreCase(yourPass)) {
                        System.out.println("Welcome to personal section!");
                    } else {
                        triesPass += 1;
                        System.out.println("Sorry, try again . You have " + (5 - triesPass) + " attemps to enter password.");
                    }
                }
            }
            else {
                tries += 1;
                System.out.println("Sorry, try again . You have " + (5 - tries) + " attemps to enter name.");
            }
            }
        input.close();

                }


    }
