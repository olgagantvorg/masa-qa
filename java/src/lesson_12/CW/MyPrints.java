package lesson_12.CW;

import java.util.ArrayList;
import java.util.List;

public class MyPrints {
    public static void main(String[] args) {
        List <IPrintable> library = new ArrayList<>();
        library.add(new Book(36));
        library.add(new Book(57));
        library.add(new Magazines(250));
        library.add(new Magazines(110));

        IPrintable[] library2 = new IPrintable[]{
                new Magazines(1450),
                new Book(1200)
        };
        for (IPrintable printable:library2){
            printable.howManyPages(((Printable)printable).getPages());
            printable.printYourType();
        }
        library.forEach(printable -> {
            printable.howManyPages(((Printable)printable).getPages());
            printable.printYourType();
        });






    }
}
