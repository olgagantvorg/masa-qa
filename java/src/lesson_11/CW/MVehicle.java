package lesson_11.CW;

import java.util.ArrayList;

public class MVehicle {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("BMW",2022));
        vehicles.add(new Bus("Scania",2021));
        vehicles.add(new Truck("Volvo",2020));
        vehicles.forEach(System.out::println);
        vehicles.forEach(Vehicle::whoAreYou);
    }
}
