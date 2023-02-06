package lesson_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Shape> collectionOfShapes=new ArrayList<>();
        Messages.printMainMenu();
        int option = Messages.optionMainMenu();
        while (option>0 && option<8){
            System.out.println("You have chosen "+option);
            switch (option){
                case 1:
                    Messages.printShapesMenu();
                    int soption = Messages.optionShapeMenu();
                    System.out.println("Choose your color:");
                    String color = input.next();
                    switch (soption){
                        case 1:
                            System.out.println("Enter square side");
                            collectionOfShapes.add(new Square(color,input.nextDouble()));
                            break;
                        case 2:
                            System.out.println("Enter rectangle wight and height");
                            collectionOfShapes.add(new Rectangle(color, input.nextDouble(), input.nextDouble()));
                            break;
                        case 3:
                            System.out.println("Enter circle radius");
                            collectionOfShapes.add(new Circle(color,input.nextDouble()));
                            break;
                        case 4:
                            System.out.println("Enter side of triangle");
                            collectionOfShapes.add(new RightTriangle(color, input.nextDouble()));
                            break;
                    }
                    break;
                case 2:
                    Messages.printCollectrion(collectionOfShapes);
                    break;
                case 3:
                    Messages.printCalculatePerimetr(collectionOfShapes);
                    break;
                case 4:
                    Messages.printCalculateArea(collectionOfShapes);
                    break;
                case 5:
                    Messages.printBigPerimetr(collectionOfShapes);
                    break;
                case 6:
                    Messages.printBigCalculateArea(collectionOfShapes);
                    break;
                case 7:
                    System.out.println("Exiting");
                    return;
            }
            Messages.printMainMenu();
            option = input.nextInt();

        }
        System.out.println("Good bye...");
        input.close();
    }


}
