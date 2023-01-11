package lesson_6;

import java.util.Date;

public class ReturnWithoutParams {
    public static void main(String[] args) {
        System.out.println("getRandom() = " + getRandom());
        long randomN = getRandom();
        System.out.println("randomN = " + randomN);

    }

    public static long getRandom(){
        Date date = new Date();
        long currDate = date.getTime();
        return currDate;

    }
}
