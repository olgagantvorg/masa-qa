package lesson_9.person;

public class Child extends Person{

    private String adress;
    @Override
    public void whoAreYou() {
        System.out.println("I am a child " + getFirstName());
    }

    public Child(String firstName, String lastName, int age, boolean isJewish,String adress) {
        super(firstName, lastName, age, isJewish);
        this.adress = adress;
    }


}
