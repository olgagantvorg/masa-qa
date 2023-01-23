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
     * Method calculates area
     * @return calculator area of the shape
     */
    public abstract double calculateArea();
    public abstract double perimetr();

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                '}';
    }
}
