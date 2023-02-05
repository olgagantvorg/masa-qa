package lesson_12;

public class Dog extends Animal implements Runnable{
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("running.....");
    }

    @Override
    public void howManyLegs() {
        System.out.println("I am a dog i have 4 legs");

    }

    @Override
    public void breathe(int amountOfOxygen) {
        System.out.println("I am a dog i breathe  "+ amountOfOxygen);;
    }
}
