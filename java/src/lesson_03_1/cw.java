package lesson_03_1;

import java.util.Scanner;

public class cw {
    public static void main(String[] args) {
    String name = "Olga";
    String name2 = "olGa";
    Scanner input = new Scanner(System.in);
    System.out.println("Введите свой возраст..");
    int age = input.nextInt();
    if (age >= 18){
        System.out.println("You are adult ");
        }
    else {
        System.out.println("You are young ");
        }
    }
}
