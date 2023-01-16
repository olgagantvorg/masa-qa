package lesson_8;

public class MainCar {
    public static void main(String[] args) {
        Engine engine = new Engine(250,"v6",false);
        Wheels[] wheels = new Wheels[5];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheels(14,2.5);

        }
        Car car = new Car("Tesla","model x",2023,engine,wheels);
        car.wheels[2].setRadius(-15);
//        car.wheels[1].radius = -5;


        System.out.println(car);
        car.sayHello();
    }
}
