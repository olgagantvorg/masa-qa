package lesson_10;

public class Rectangle extends Shape{


    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }



    /**
     * Method calculates area
     *
     * @return calculator area of the shape
     */
    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double perimetr() {
        return width*2+height*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                " " + super.toString();
    }
}
