package lesson_12;

public class MyMain {
    public static void main(String[] args) {
        InterfaceClass interfaceClass = new InterfaceClass();
        System.out.println(interfaceClass.printDef(6,7));
        System.out.println("InterfaceClass.NAME = " + InterfaceClass.NAME);
    }
}
