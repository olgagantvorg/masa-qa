package lesson_3;

public class comparison {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 99;
        int num3 = 99;
        System.out.println("num1 == num2 " + (num1 == num2));
        System.out.println("num2 == num3 " + (num2 == num3));
        System.out.println("num1 <= num3 " + (num1 <= num3));
        System.out.println("num2 <= num3 " + (num2 <= num3));
        System.out.println("num2 <= num1 " + (num2 <= num1));
        System.out.println("num2 != num1 " + (num2 != num1));
        System.out.println("num2 != num3 " + (num2 != num3));
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
    }
}
