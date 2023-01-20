package lesson_9;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isJewish;

    public Person(String firstName, String lastName, int age, boolean isJewish) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isJewish = isJewish;
    }

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isJewish() {
        return isJewish;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isJewish=" + isJewish +
                '}';
    }
    @Override
    public void whatIsyourName(){
        System.out.println("My name is " + firstName +" "+ lastName);
    }
}
