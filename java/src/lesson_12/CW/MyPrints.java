package lesson_12.CW;

import java.util.ArrayList;
import java.util.List;

public class MyPrints {
    public static void main(String[] args) {
        List <Printable> library = new ArrayList<>();
        library.add(new Book(36));
        library.add(new Book(57));
        library.add(new Magazines(250));
        library.add(new Magazines(110));

        Printable[] library2 = new Printable[]{
                new Magazines(1450),
                new Book(1200)
        };
        for (Printable printable:library2){
            printable.howManyPages();
            printable.printYourType();
        }
        library.forEach(printable -> {
            printable.howManyPages();
            printable.printYourType();
        });






    }
}
