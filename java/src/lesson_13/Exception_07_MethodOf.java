package lesson_13;

public class Exception_07_MethodOf {
    public static void main(String[] args) {
        int [] array = new int[5];
        try {
            array[57] = 56;
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
    }
}
