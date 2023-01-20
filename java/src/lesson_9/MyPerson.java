package lesson_9;

public class MyPerson
{
    public static void main(String[] args) {
        Person person = new Person("Olga", "Gantvorg", 31, true);
        System.out.println(person);
        person.whatIsyourName();
        Student student = new Student("Olga", "Gantvorg",31,true,55);
        student.whatIsyourName();
        student.getFirstName();
    }
}
