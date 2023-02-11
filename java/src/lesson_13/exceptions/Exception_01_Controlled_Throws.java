package lesson_13.exceptions;

import java.io.File;
import java.io.FileReader;
///ctrl alt o убирать ненужные импорты
public class Exception_01_Controlled_Throws {
    public static void main(String[] args) throws Exception {
        File ourFile = new File("D://file.txt");
        FileReader fileReader = new FileReader(ourFile);
        fileReader.close();
    }
}
