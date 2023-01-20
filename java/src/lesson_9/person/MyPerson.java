package lesson_9.person;

public class MyPerson
{
    public static void main(String[] args) {
        //Person person = new Person("Olga", "Gantvorg", 31, true);
        //Person person;
        //System.out.println(person);
       // person.whatIsyourName();
        Child child = new Child("Child","Child",12,false);
        Student student = new Student("Olga", "Gantvorg",31,true,55);
        Person newChild = new Child()
        student.whatIsyourName();
        student.getFirstName();
        student.whoAreYou();
        child.whoAreYou();
    }
}
