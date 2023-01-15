package lesson_7.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentMain {
    public static void main(String[] args) {
        Student alex = new Student( "alex", 25);



        System.out.println(alex.getAge());
        System.out.println(alex.getName());
        alex.setAge(45);
        alex.setName("Vasya");
        System.out.println(alex);
        alex.setAge(-1);
        System.out.println(alex);


    }
}
