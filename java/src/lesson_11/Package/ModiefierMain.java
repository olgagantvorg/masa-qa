package lesson_11.Package;

import lesson_11.defaultClass;

public class ModiefierMain {
    public static void main(String[] args) {
        defaultClass defaultClass = new defaultClass();
     ///   System.out.println(defaultClass.name); default access modifier

        ProtectedClass.printCounter();
        System.out.println("ProtectedClass.FINAL_COUNTER = " + ProtectedClass.FINAL_COUNTER);
        System.out.println("ProtectedClass.MY_NAME = " + ProtectedClass.MY_NAME);
    }

}
