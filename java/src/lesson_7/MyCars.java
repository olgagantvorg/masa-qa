package lesson_7;

public class MyCars {
    public static void main(String[] args) {
        Car bmw = new Car("blue");
        bmw.carIsReady();
        System.out.println("bmw.color = " + bmw.color);
        bmw.color = "white";
        bmw.isElectrical = true;
        bmw.manufacturing = "BMW";
        bmw.year = 2022;
        bmw.model = "model 7";
        Car.classOccurancies();

        // new car

        Car tesla = new Car();
        tesla.color = "blue";
        tesla.model = "10";
        Car.classOccurancies();

        Car car = new Car("white",1991,"Сarhome","Supercar",false);
        car.printCar();
        Car.classOccurancies();


    }
}
