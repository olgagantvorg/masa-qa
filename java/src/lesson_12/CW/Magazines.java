package lesson_12.CW;

public class Magazines extends Printable {
    @Override
    public void printYourType() {
        System.out.println("I am a magazine");
    }


    @Override
    public void howManyPages(int pages) {
        System.out.println("I am magazine.I have " + pages + " pages");;
    }



    public Magazines(int pages) {
        super(pages);
    }


}
