package lesson_03_1;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = input.nextInt();
        if (number % 2 == 1) {
            System.out.println("Число " + number + " нечетное");
        }
        else {
            System.out.println("Число " + number + " четное");
        }
    }
}
