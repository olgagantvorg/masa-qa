package lesson_8;

public class MyCars {
    public static void main(String[] args) {

        Car car = new Car("BMW",
                "model 1",
                2018,
                new Engine(500,"electrical",false),
                new Wheels[]{
                        new Wheels(20,8.6),
                        new Wheels(20,8.6),
                        new Wheels(20,8.6),
                        new Wheels(20,8.6)
                });
        System.out.println(car);


    }
}
