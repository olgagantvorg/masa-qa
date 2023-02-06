package lesson_10;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
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
