package lesson_12;

import jdk.jshell.Snippet;
import lesson_12.animals.Interfaces.Breathable;

import java.util.ArrayList;
import java.util.List;

public class MyAnimals {
    public static void main(String[] args) {

        List<Breathable> list = new ArrayList<>();
        Breathable dogInreface = new Dog();
        Dog dog = new Dog();
        Animal dog2 = new Dog();
        list.add(dogInreface);
        list.add(new Bird());
        list.add(new Snake());
        list.forEach(animal -> animal.breathe(5));

    }
}
