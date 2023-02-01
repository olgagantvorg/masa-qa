package lesson_12;

import lesson_7.Car;

public interface BasicInterface {
    // public and abctract by default
    void sayHello();
    String NAME = "vasya";

    public static void printInfo(){
        System.out.println();
    };
    default int printDef(int a,int b){
        return sumNumber(5,7);
    };
    private int sumNumber(int a,int b) {
        return  a + b;
    }
}
