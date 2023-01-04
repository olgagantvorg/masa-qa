package lesson_5.Arrays;

public class ArrayException {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
//        array[4] = 3; - ошибка
    }
}
