package lesson_04;

public class ExcludingOr {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        System.out.println(a + " ^ " + b + " = " + (a ^ b)); // одинаковые значения false разне true
        System.out.println(a + " ^ " + c + " = " + (a ^ c));
        System.out.println(c + " ^ " + d + " = " + (c ^ d));
    }
}
