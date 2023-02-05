package lesson_12.CW;

public class Book implements Printable {
    @Override
    public void printYourType() {
        System.out.println("I am a book");
    }
    private int PAGES;

    @Override
    public void howManyPages() {
        System.out.println("I am a book.I have "+ PAGES + " pages");
    }

    public int getPAGES() {
        return PAGES;
    }

    public void setPAGES(int PAGES) {
        this.PAGES = PAGES;
    }

    public Book(int PAGES) {
        this.PAGES = PAGES;
    }

    @Override
    public String toString() {
        return "Book{" +
                "PAGES=" + PAGES +
                '}';
    }
}
