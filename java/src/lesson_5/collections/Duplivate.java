package lesson_5.collections;

import java.util.HashMap;

public class Duplivate {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        char[] textChar = text.toCharArray();
       HashMap<Character , Integer> collection = new HashMap<>();
        for (char letter : textChar) {
            if (collection.containsKey(letter)) {
                collection.put(letter, collection.get(letter) + 1);
            }
            else {
                collection.put(letter, 1);
            }
        }
        collection.forEach((letter, number)-> System.out.print(letter + "  " + number));
        System.out.println("collection.get('L') = " + collection.get('L'));
    }
}
