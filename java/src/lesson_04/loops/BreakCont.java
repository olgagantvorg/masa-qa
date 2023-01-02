package lesson_04.loops;

public class BreakCont {
    public static void main(String[] args) {
        var a = 0;
        while (a < 20){
            a++;

            if (a % 5 == 0) {
                continue;
            }
            if (a == 13) {
                break;
            }
            System.out.print(a + " ");

        }
    }
}
