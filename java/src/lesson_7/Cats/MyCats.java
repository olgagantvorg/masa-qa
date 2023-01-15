package lesson_7.Cats;

import java.util.ArrayList;

public class MyCats {
    static int count = 0;

    public static void main(String[] args) {

        ArrayList<Cat> catList = new ArrayList<>();
       catList.add(new Cat("Vasya","white",1));
       count++;
       catList.add(new Cat("Mishka","black",-1));
       count++;
       catList.add(new Cat("Alisa","red",2));
       count++;
       catList.add(new Cat("Plusha","red",2));
       count++;
       catList.add(new Cat("Persik","grey",1));
       count++;
       catList.forEach(cat -> System.out.println(cat));
       catList.forEach(Cat::sayMeow);

       System.out.println("Number of cats " + count);

    }
}
