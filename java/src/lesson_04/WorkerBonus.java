package lesson_04;

import java.util.Scanner;

public class WorkerBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your experience: ");
        int exp = input.nextInt();
        System.out.println("Enter your salary: ");
        double sal = input.nextDouble();
        double bonus = 0;
        if (exp >= 0 && exp < 5) {
            bonus = 1.1;
        }
        else if (exp >= 5 && exp < 10) {
            bonus = 1.15;
        }
        else if (exp >= 10 && exp < 15) {
            bonus = 1.25;
        }
        else if (exp >= 15 && exp < 20) {
            bonus = 1.35;
        }
        else if (exp >= 20 && exp < 25) {
            bonus = 1.45;
        }
        else if (exp >= 25) {
            bonus = 1.5;
        }
        else {
            bonus = 1;
        }
        System.out.println("Bonus amount is " + (bonus * sal - sal ));
        System.out.println("New salary is "+ (bonus * sal));
    }
}
