package lesson_11.CW;

public class Truck extends Vehicle{
    public Truck(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I am a truck "+ getBrand() + " " +getYear());

    }

}
