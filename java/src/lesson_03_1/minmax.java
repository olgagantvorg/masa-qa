package lesson_03_1;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double min;
        double max;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        a = input.nextDouble();
        System.out.println("Enter second number ");
        b = input.nextDouble();
        System.out.println("Enter third number ");
        c = input.nextDouble();
        avg = (a + b + c) / 3;
        System.out.println("Averege = " + avg);
        max = (a > b) ? a : b ;
        max = (max > c) ? max : c;
        min = (a > b) ? b : a;
        min = (min > c) ? c : min ;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
