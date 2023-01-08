package lesson_5.HW;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            number.add(random.nextInt(50));
        }
    }
    }

