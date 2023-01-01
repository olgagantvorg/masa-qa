package lesson_04.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        do {
            System.out.println(a);
            a+=5;
        }
        while (a < 10);
//            System.out.println(a);
//        }
    }
}
