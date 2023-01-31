package lesson_11.CW;

public class Bus extends Vehicle{
    public Bus(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I am a bus " + getBrand() +" " + getYear());

    }

}
