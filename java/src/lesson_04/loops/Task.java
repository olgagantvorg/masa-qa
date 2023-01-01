package lesson_04.loops;

public class Task {
    public static void main(String[] args) {
        int count = 1000;
        for (int i = count; i >= 0 ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
