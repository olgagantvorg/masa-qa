package lesson_8;

public class Wheels {
    private int radius;
    private double pressure;
    public Wheels(int radius, double pressure) {
        this.radius = (radius <=15) ?16 :radius;
        this.pressure = pressure;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = (radius <=15) ?16 :radius;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "radius=" + radius +
                ", pressure=" + pressure +
                '}';
    }
}
