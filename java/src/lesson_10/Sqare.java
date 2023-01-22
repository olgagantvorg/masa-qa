package lesson_10;

public class Sqare extends Shape{
    private double side;

    public Sqare(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculatorArea() {
        return side*side;
    }

    @Override
    public double perimetr() {
        return side*4;
    }
}
