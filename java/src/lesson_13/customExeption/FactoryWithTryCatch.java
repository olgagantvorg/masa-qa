package lesson_13.customExeption;

public class FactoryWithTryCatch {
    public static void main(String[] args) {
        Worker worker = new Worker("Vasya");
        worker.onVacation();
        try{
            worker.isHeReady();
        } catch (WorkerIsNotReadyException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("e.toString() = " + e.toString());
            e.printStackTrace();
        }
    }

}
