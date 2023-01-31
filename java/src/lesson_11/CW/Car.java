package lesson_11.CW;

public class Car extends Vehicle{

    public Car(String brand, int year) {
        super(brand, year);
    }



    @Override
    public void whoAreYou() {
        System.out.println("I am a car " + getBrand() + " "+ getYear() );

    }
}
