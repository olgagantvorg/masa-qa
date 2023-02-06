package lesson_10;

public class RightTriangle extends Shape{
    private double legFirst;
    private double legSecong;
    private double hypotenuse;

    public RightTriangle(String color, double side1, double side2, double side3) {
        super(color);
        this.legFirst = side1;
        this.legSecong = side2;
        this.hypotenuse = side3;
    }

    /**
     * Method calculates area
     *
     * @return calculator area of the shape
     */
    @Override
    public double calculateArea() {
        return 0.5*(legFirst * legSecong);
    }

    @Override
    public double perimetr() {

        return legFirst + legSecong + hypotenuse;
    }


    @Override
    public String toString() {
        return "RightTriangle{" +
                "first leg=" + legFirst +
                ", second leg=" + legSecong +
                ", hypotenuse=" + hypotenuse +
                " " + super.toString();
    }
}
