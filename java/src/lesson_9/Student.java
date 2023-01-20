package lesson_9;

public class Student extends Person {
    public double grade;

    public Student(String lastName, double grade) {
        super(lastName);
        this.grade = grade;
    }

    public Student(String firstName, String lastName, int age, boolean isJewish, double grade) {
        super(firstName, lastName, age, isJewish);
        this.grade = grade;
    }

    public Student(double grade) {
        this.grade = grade;
    }

    @Override
    public void whatIsyourName() {
        System.out.println("I am a student my name is " + getFirstName());
    }
}
