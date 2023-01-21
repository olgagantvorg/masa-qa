package lesson_9.classes;

import java.util.ArrayList;

public class MyVehicles {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bus(2020,"Scania",203434L,"white"));
        vehicles.add(new Car(2022,"BMW",true,"white"));
        vehicles.add(new Truck(2015,"MAN","white","great"));
        vehicles.forEach(item-> {
            item.sayHello();
            item.whoAreYou();}
        );
        }
    }

