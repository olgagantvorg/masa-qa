package lesson_10;

import java.util.List;
import java.util.Scanner;

public class Messages {
    public static void printMainMenu(){
        System.out.println("\nPlease choose from the next Menu:");
        System.out.println("1. Add new shape");
        System.out.println("2. List all shapes");
        System.out.println("3. Sum all circumferences");
        System.out.println("4. Sum all areas");
        System.out.println("5. Find the biggest circumference");
        System.out.println("6. Find the biggest area");
        System.out.println("7. Exit");
    }

    public static int optionMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option<=0 || option>=8){
            System.out.println("You enter wrong number, try again.");
            option = scanner.nextInt();
        }
        return option;
    }
    public static void printShapesMenu() {
        System.out.println("\nPlease choose from the next Shapes:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Right triangle");
    }

    public static int optionShapeMenu(){
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option<=0 || option>=5){
            System.out.println("You enter wrong number, try again.");
            option = scanner.nextInt();
        }
        return option;
    }
    public static void printCollectrion(List<Shape> list){
        if (list.size() == 0){
            System.out.println("There are no shapes in list.");
            return;
        }
        list.forEach(shape -> System.out.println(shape));
    }
    public static void printCalculatePerimetr (List <Shape> list) {
        double sum = 0;
        if (list.size() == 0) {
            System.out.println("There are no shapes in list.");
            return;
        } else {
            for (Shape shape : list) {
                sum += shape.perimetr();
            }
        }
        System.out.println("The sum of perimetrs is " +sum);
    }

    public static void printCalculateArea (List <Shape> list) {
        double sum = 0;
        if (list.size() == 0) {
            System.out.println("There are no shapes in list.");
            return;
        } else {
            for (Shape shape : list) {
                sum += shape.calculateArea();
            }
        }
        System.out.println("The sum of areas is " +sum);
    }

    public static void printBigPerimetr(List<Shape> list){
        double maxValue = 0;
        if (list.size() == 0) {
            System.out.println("There are no shapes in list.");
            return;
        }
        else {
            for (Shape shape: list){
                if (shape.perimetr() > maxValue){
                    maxValue = shape.perimetr();
                }
            }
        }
        System.out.println("The biggest perimetr of all shapes is " + maxValue);

    }

    public static void printBigCalculateArea(List<Shape> list){
        double maxValue = 0;
        if (list.size() == 0){
            System.out.println("There are no shapes in list.");
            return;
        }
        else {
            for (Shape shape: list){
                if (shape.calculateArea() > maxValue){
                    maxValue = shape.calculateArea();
                }
            }
        }
        System.out.println("The biggest area of all shapes is " + maxValue);

    }
}

