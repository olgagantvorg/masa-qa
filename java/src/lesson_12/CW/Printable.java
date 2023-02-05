package lesson_12.CW;

public abstract class Printable implements IPrintable{

    private int pages;

    public Printable(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
