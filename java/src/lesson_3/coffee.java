package lesson_3;

import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int drinkCost = 0;
        System.out.println("Enter your amount..");
        int budget = input.nextInt();
        if (budget > 0) {
            System.out.println("1 - cappuccino (10 p)");
            System.out.println("2 - espresso (20 p)");
            System.out.println("3 - americano (15 p)");
            System.out.println("4 - tea (5 p)");
            System.out.println("Choose your drink");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    drinkCost += 10;
                    break;
                case 2:
                    drinkCost += 20;
                    break;
                case 3:
                    drinkCost += 15;
                    break;
                case 4:
                    drinkCost += 5;
                    break;
                default:
                    System.out.println("There is no another drinks. Try again. ");
            }
            if (choice >= 1 && choice <= 4) {
                if (budget >= drinkCost) {
                    System.out.println("User choice " + choice + " chosen");
                    System.out.println("Take your drink");
                    System.out.println("Your change is " + (budget - drinkCost));
                    budget -= drinkCost;
                    {
                        System.out.println("drink = " + budget);

                    }
                }
            }


    else if (budget < 0) {
                System.out.println("Your budget is less than 0");
            }
    else if (budget < 0) {
                System.out.println("Your budget is 0");

            }
        }

    }
}