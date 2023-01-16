package lesson_8;

import java.util.Arrays;

public class Car {

    // 1. Fields
    private String model;
    private String brand;
    private int year;
    private Engine engine;
    public Wheels [] wheels;

    // 2. constructor

    public Car(String model, String brand, int year, Engine engine, Wheels[] wheels) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
        this.wheels = wheels;
    }
    // 3. get and set

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }
    //4. custom methods

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
    public void sayHello(){
        System.out.println("This car " + model + " say hello");
    }
}

