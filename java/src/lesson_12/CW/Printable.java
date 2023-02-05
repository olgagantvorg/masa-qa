package lesson_12.CW;

public interface Printable {

    int PAGES = 500;

    void printYourType();
    default void howManyPages(){
        System.out.println("I have " + PAGES + "pages");

    };


}
