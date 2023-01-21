package lesson_9.classes;

public class Bus extends Vehicle {

    private long capacity;
    private String color;

    public Bus(int year, String manufacturer, long capacity, String color) {
        super(year, manufacturer);
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public void whoAreYou() {
        System.out.println("Hello " + getManufacturer());
    }

    @Override
    public void sayHello() {
        System.out.println("Hello i am bus");
    }
}
