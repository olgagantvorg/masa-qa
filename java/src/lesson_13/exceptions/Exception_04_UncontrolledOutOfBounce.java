package lesson_13.exceptions;

public class Exception_04_UncontrolledOutOfBounce {
    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println("Starting program.....");

        array[56] = 56;

        // the program ends with exceptions this part of code will not be executed
        System.out.println("Finishing program.....");


    }
}