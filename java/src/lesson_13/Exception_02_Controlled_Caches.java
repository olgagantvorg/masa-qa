package lesson_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_02_Controlled_Caches {
    public static void main(String[] args) {
        File ourFile = new File("D://file.txt");
        try {
            FileReader fileReader = new FileReader(ourFile);
        } catch (Exception exception) {
            System.out.println("Where is the file?");
            System.out.println(exception.getMessage());
        }

    }
}
