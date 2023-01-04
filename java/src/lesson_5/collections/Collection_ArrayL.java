package lesson_5.collections;

import java.util.ArrayList;

public class Collection_ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(5);
        myArrayList.add(7);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        for (Integer number : myArrayList) {
            System.out.println(number);
        }
        for (int i = 0; i < 15; i++) {
            myArrayList.add(i);
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
        myArrayList.set(3,7);
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
        System.out.println("myArrayList.indexOf(5) = " + myArrayList.indexOf(5));
        System.out.println("myArrayList.indexOf(9) = " + myArrayList.indexOf(9));
        myArrayList.forEach(number-> System.out.print(number + " "));
    }
    }


