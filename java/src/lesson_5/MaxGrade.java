package lesson_5;

import java.util.Random;

public class MaxGrade {
    public static void main(String[] args) {
        Random random = new Random();
        int grade[] = new int[5];
        String names[] = {"Gleb","Karina","Vasya","Irina","Roman"};
        for (int i = 0; i < grade.length; i++) {
            grade[i] = random.nextInt(100);
        }
        int max = grade[0];
        int maxNumber = 0;
        for (int i = 0; i < grade.length; i++) {
            System.out.println(names[i] + " " + grade[i]);
        }
        for (int i = 1; i < grade.length; i++) {
            if (grade[i] > max){
                max = grade[i];
                maxNumber= i;
            }

        }
        System.out.println("The best student is " + names[maxNumber] + " with grade " + grade[maxNumber]);
    }
}
