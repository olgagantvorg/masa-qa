package lesson_13.customExeption;

public class Factory {
    public static void main(String[] args) throws WorkerIsNotReadyException {
        Worker worker = new Worker("Alex");
        worker.readyToWork();
        worker.isHeReady();
        worker.onVacation();
        worker.isHeReady();

    }
}
