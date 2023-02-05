package lesson_12.CW;

public interface IPrintable {

    int PAGES = 500;

    void printYourType();
    default void howManyPages(int pages){
        System.out.println("I have " + PAGES + "pages");

    };


}
