package lesson_7.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();

        HashMap<String,Integer> students = new HashMap<>();
        students.put("Vasya",41);
        students.put("Petya",27);
        for(Map.Entry<String,Integer> student: students.entrySet()){
            studentsList.add(new Student(student.getKey(), student.getValue()));
        }
        studentsList.forEach(student -> System.out.println(student));
    }
}
