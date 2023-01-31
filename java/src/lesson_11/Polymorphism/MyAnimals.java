package lesson_11.Polymorphism;

import java.util.ArrayList;

public class MyAnimals {
    public static void main(String[] args) {
        Iguana iguana = new Iguana();
        Lizards lizardsIguana = new Iguana();
        Animals animalsIguana = new Iguana();
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(iguana);
        animals.add(animalsIguana);
        animals.add(lizardsIguana);

        animals.forEach(animal -> animal.hello());
    }
}
