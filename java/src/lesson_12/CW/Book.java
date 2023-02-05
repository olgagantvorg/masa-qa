package lesson_12.CW;

public class Book extends Printable {
    @Override
    public void printYourType() {
        System.out.println("I am a book");
    }

    @Override
    public void howManyPages(int pages) {
        System.out.println("I am a book.I have "+ pages + " pages");
    }




    public Book(int pages, int PAGES) {
        super(pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "PAGES=" + PAGES +
                '}';
    }
}
