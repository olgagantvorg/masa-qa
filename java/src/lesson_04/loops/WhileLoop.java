package lesson_04.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        while (a < 10){
            System.out.println("a = " + a);
            a++;
        }
    }
}
