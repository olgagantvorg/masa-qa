package lesson_3;

public class operators {
    public static void main(String[] args) {
        int a = 15;
        int b = 6;
        double c = 20;
        double d = 7;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        // остаток от деления всегда целое число


        double result = c / d;
        System.out.println("c / d = " + result);
        System.out.println("result * d = " + (result * d));
        System.out.println("c % d = " + (c % d));
//        int res1 = a / c; невалидно
        double res1 = a / c;
        System.out.println("c / 0 = " + (c / 0));
//        System.out.println("a / 0 = " + (a / 0)); на ноль целые числа делить нельзя


    }
}
