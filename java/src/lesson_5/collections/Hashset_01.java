package lesson_5.collections;

import java.util.HashSet;

public class Hashset_01 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        System.out.println("names.isEmpty() = " + names.isEmpty());
        names.add("Vasya");
        names.add("Nikita");
        names.add("Mari");
        names.add("Nikita");
        names.add("Karina");
        System.out.println("names.isEmpty() = " + names.isEmpty());
        names.forEach(name-> System.out.println(name));

    }
}
