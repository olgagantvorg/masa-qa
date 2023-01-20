package lesson_9.person;

public class Child extends Person{
    @Override
    public void whoAreYou() {
        System.out.println("I am a child");
    }

    public Child(String firstName, String lastName, int age, boolean isJewish) {
        super(firstName, lastName, age, isJewish);
    }


}
