package lesson_5.HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        Random random = new Random();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(50));
        }
        for (int num : numbers) {
            if (count.containsKey(num)){
                count.put(num,(count.get(num) + 1));
            }
            else {
                count.put(num,1);
            }
        }
        System.out.println("Amount of unique numbers " + count.size() + " in the list.Here is their breakdown." + "Amount of not unique numbers is " + (numbers.size()- count.size()));
        count.forEach((unicueNumber,number)-> System.out.println(unicueNumber + " number is in the list " + number + " times"));

    }
    }

