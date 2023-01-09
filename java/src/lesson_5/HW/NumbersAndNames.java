package lesson_5.HW;

import java.util.*;

public class NumbersAndNames {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        HashMap<Integer, String> namesAndNumbers = new HashMap<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            System.out.println("Add names.Left to add " + (size - i) + " names." );
            names.add(input.next());
            numbers.add(random.nextInt());
            namesAndNumbers.put(numbers.get(i), names.get(i));
        }
        namesAndNumbers.forEach((number,name)-> System.out.println("Number of " + name + " is " + number));

        input.close();
    }

}
