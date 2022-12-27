package lesson_03_1;

import java.util.Scanner;

public class cw {
    public static void main(String[] args) {
    String name = "Olga";
    String name2 = "olGa";
    String anotherName = "Olga";
    System.out.println(name == anotherName);
    String newName = new String("Olga");
    System.out.println(name == newName);
    boolean areEquel = name.equals(name2);
    System.out.println("areEquel = " + areEquel);

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
