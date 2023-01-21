package lesson_9.classes;

public class Car extends Vehicle{

    private boolean isElectrical;
    private String color;

    public Car(int year, String manufacturer, boolean isElectrical, String color) {
        super(year, manufacturer);
        this.isElectrical = isElectrical;
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("Hello I am a car");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello i am "+ getManufacturer());
    }
}
