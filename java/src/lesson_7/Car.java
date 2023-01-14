package lesson_7;

public class Car {
    String color;
    int year;
    String manufacturing;
    String model;
    boolean isElectrical;
    int created = 0;
    static int wasCreated = 0;
    public void carIsReady(){
        System.out.println("Car is ready.");
    }
    public Car(String color){
        this.color = color;
    }
    public Car(){
        created++;
        wasCreated++;
        System.out.println("created = " + created);

    }
    public Car(String manufacturing, int year){
        this.manufacturing = manufacturing;
        this.year = year;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public Car(String color, int year, String manufacturing, String model, boolean isElectrical) {
        this.color = color;
        this.year = year;
        this.manufacturing = manufacturing;
        this.model = model;
        this.isElectrical = isElectrical;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
    }

    public static void classOccurancies(){
        System.out.println("wasCreated = " + wasCreated);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturing='" + manufacturing + '\'' +
                ", model='" + model + '\'' +
                ", isElectrical=" + isElectrical +
                '}';
    }
    public void printCar(){
        System.out.println(this); //this to string
    }
}
