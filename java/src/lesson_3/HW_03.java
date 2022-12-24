package lesson_3;

public class HW_03 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("result = " + result); //-16.7

        int a = 5;
        int b = 8;
        int superA = a-- - --a + ++a + a++ + a;
        System.out.println("superA = " + superA); //15=4-3+4+5+5
        int superB = ++b - b++ + ++b - --b;
        System.out.println("superB = " + superB); //1=9-9+11-10


        // task 2
        int x = 10;
        int y = 12;
        int z = 3;
        System.out.println("x = " + (x += y -x++ * z)); //10+12-10*3=-8
        System.out.println("z = " + (z = --x - y * 5)); //-9-12*5=-69
        System.out.println("y = " + (y /= x + 5 % z)); //12/-8 +остаток от дел 5/3=-3 с учетом округления
        System.out.println("z = " + (z = x++ + y * 5)); //-7+-3.5*5 = -24 с учетом округления
        System.out.println("x = " + (x = y - x++ * z)); //-3.5- -8 *-24 = -195 с учетом округления

    }
}
