package lesson_9.classes;

public abstract class Vehicle {

    private int year;
    private String manufacturer;

    public Vehicle(int year, String manufacturer) {
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    public abstract void whoAreYou();
}
