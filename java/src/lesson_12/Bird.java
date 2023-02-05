package lesson_12;

import lesson_12.animals.Interfaces.Breathable;
import lesson_12.animals.Interfaces.IFly;

public class Bird extends Animal implements IFly {
    @Override
    public void howManyLegs() {
        System.out.println("I am a bird i hae 2 legs");
    }



    @Override
    public void fly() {
        System.out.println("I am a bird i can fly");

    }
}
