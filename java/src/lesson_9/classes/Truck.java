package lesson_9.classes;

public class Truck extends Vehicle{

    private String color;
    private String type;

    public Truck(int year, String manufacturer, String color, String type) {
        super(year, manufacturer);
        this.color = color;
        this.type = type;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I am a truck");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i am truck");
    }
}
