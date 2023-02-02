package lesson_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_01_Controlled_Throws {
    public static void main(String[] args) throws Exception {
        File ourFile = new File("D://file.txt");
        FileReader fileReader = new FileReader(ourFile);
        fileReader.close();
    }
}
