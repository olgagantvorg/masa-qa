package lesson_03_1;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "Admin";
        String password = "P@ssword";
        System.out.println("Enter your name: ");
        String yourName = input.nextLine();

        if (yourName.equalsIgnoreCase(userName)) {
            System.out.println("Enter a password: ");
            String yourPass = input.nextLine();
            if (yourPass.equalsIgnoreCase(password)) {
                System.out.println("Hello " + userName + ", you enter to the system!");
            } else {
                System.out.println("You enter wrong password");
            }
        } else {
            System.out.println("There is no user with this name");
        }

       input.close();


    }

}






