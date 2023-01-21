package lesson_9.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPerson
{
    public static void main(String[] args) {
        //Person person = new Person("Olga", "Gantvorg", 31, true);
        //Person person;
        //System.out.println(person);
       // person.whatIsyourName();
        Child child = new Child("Child","Child",12,false,"Israel");
        Student student = new Student("Olga", "Gantvorg",31,true,55);
        Person newChild = new Child("person","person",45,true,"Israel");
        student.whatIsyourName();
        student.getFirstName();
        student.whoAreYou();
        child.whoAreYou();
        List<Person> list = new ArrayList<>();
        list.add(child);
        list.add(student);
        list.add(newChild);
        System.out.println();
        list.forEach(someOne->someOne.whoAreYou());
    }
}
