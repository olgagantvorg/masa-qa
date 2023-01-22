package lesson_10;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     *
     * @return
     */
    public abstract double calculatorArea();
    public abstract double perimetr();
}
