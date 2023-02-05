package lesson_12.CW;

public class Magazines implements Printable{
    @Override
    public void printYourType() {
        System.out.println("I am a magazine");
    }
    private int PAGES;

    @Override
    public void howManyPages() {
        System.out.println("I am magazine.I have " + PAGES + " pages");;
    }

    public int getPAGES() {
        return PAGES;
    }

    public void setPAGES(int PAGES) {
        this.PAGES = PAGES;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "PAGES=" + PAGES +
                '}';
    }

    public Magazines(int PAGES) {
        this.PAGES = PAGES;
    }
}
