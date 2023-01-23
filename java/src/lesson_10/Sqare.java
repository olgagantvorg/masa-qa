package lesson_10;

public class Sqare extends Shape {
    private double side;

    public Sqare(String color, double side) {
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
        return side*4;
    }

    @Override
    public String toString() {
        return "Sqare{" +
                "side=" + side +
                " " + super.toString();
    }
}
