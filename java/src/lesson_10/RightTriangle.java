package lesson_10;

public class RightTriangle extends Shape{
    private double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    /**
     * Method calculates area
     *
     * @return calculator area of the shape
     */
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double perimetr() {
        return 3*side;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "side=" + side +
                "} " + super.toString();
    }
}
