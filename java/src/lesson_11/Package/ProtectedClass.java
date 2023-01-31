package lesson_11.Package;

import lesson_11.defaultClass;

public class ProtectedClass extends defaultClass {
    public static final double FINAL_COUNTER = Math.PI;
    public static final String MY_NAME = "Petya";
    public static int age;
    public static void printCounter() {
        System.out.println(FINAL_COUNTER);
    }
    public ProtectedClass(){
        age++;

    }

}
