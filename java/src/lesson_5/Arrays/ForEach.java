package lesson_5.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int arrey[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(arrey[i] + " ");

        }
        System.out.println();
        // iter
        int arrey2[]= new int[10];
        for (int num : arrey2) {
            num = 5;
            System.out.print(num + " ");
        }


        }
    }

