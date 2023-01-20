package lesson_9.chess;

public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
    public abstract boolean canYouMove();

    public abstract void introduceYourSelf();
}
