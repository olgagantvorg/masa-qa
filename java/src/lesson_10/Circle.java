package lesson_10;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    /**
     * Method calculates area
     *
     * @return calculator area of the shape
     */
    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double perimetr() {

        return radius*Math.PI*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " " + super.toString();
    }
}
