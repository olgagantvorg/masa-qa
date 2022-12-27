package lesson_03_1;

public class ternary {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 6;
        String result;
        result = (a == b) ? "a and b are equel" : "a and b are equel";
        System.out.println("result = " + result);
        result = (a == c) ? "a and с are equel" : (a > c) ? "a bigger then c" : "a less than c";
        System.out.println("result = " + result);
    }
}
