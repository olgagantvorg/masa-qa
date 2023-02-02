package lesson_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_05_OrderOfExecution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = null;
        String lastName = "Komanov";
        try {
            System.out.println("What is your age?");
            int age = input.nextInt();
        }
        catch (InputMismatchException exception){
            System.out.println("Это тест про возраст");
            exception.printStackTrace();
        }
        finally {
            System.out.println("Goodbye");
        }

        System.out.println(lastName.length());
//        System.out.println(name.length());
//        System.out.println("age = " + age);
    }
}
