package lesson_6;

public class ReturnWithParams {
    public static void main(String[] args) {
        System.out.println(number(8,9));
        int c = number(767,244);
        int first = 5;
        int second = 55;
        System.out.println(number(first,second));
    }

    public static int number(int a,int b){
        return (a+b);
    }
}
