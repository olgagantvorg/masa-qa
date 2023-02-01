package lesson_12;

import lesson_12.animals.Interfaces.Breathable;

public class Snake extends Animal implements Breathable {
    @Override
    public void howManyLegs() {
        System.out.println("I am a snake, i have no legs...");
    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("I am a snake i breathe " + amountOfOxygen);;
    }
}
