package lesson_04;

public class GlobalLocal {
    public static void main(String[] args) {
        String out = "Outside";
        System.out.println("out = " + out);
        for (int i = 0; i >= 0; i--) {
            out = "We have inside loop";
            int a = 5;
            System.out.println("a = " + a);
        }
        System.out.println("out = " + out);
    }
}