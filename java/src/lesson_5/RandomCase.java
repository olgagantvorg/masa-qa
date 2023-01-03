package lesson_5;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomCase {
    public static void main(String[] args) {
        Random random = new Random();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int randomInt2 = random.nextInt();
        double random2 = random.nextDouble();
        int randomInt = random.nextInt(10);
        int randomBounce = threadLocalRandom.nextInt(99,100);

        System.out.println("randomInt2 = " + randomInt2);
        System.out.println("random2 = " + random2);
        System.out.println("randomInt = " + randomInt);
        System.out.println("randomBounce = " + randomBounce);
    }
}
