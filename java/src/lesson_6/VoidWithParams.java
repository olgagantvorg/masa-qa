package lesson_6;

import java.util.ArrayList;

public class VoidWithParams {
    public static void main(String[] args) {
        sayHello("Alex",77);
        String studName = "Donald";
        sayHello(studName,89);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        printList(arrayList);

    }
    public static void sayHello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " age");

    }
    public static void printList(ArrayList<Integer> list){
        System.out.println("list.size() = " + list.size());
        System.out.println();
        list.forEach((number)-> System.out.print(number + " "));

    }
}
