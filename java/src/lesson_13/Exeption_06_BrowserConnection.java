package lesson_13;

public class Exeption_06_BrowserConnection {
    public static void main(String[] args) throws InterruptedException{
        String response = null;
        System.out.println("====================================================");
        System.out.println("Opening browser");
        System.out.println("Trying to create connection");
        Thread.sleep(3000);
        System.out.println("====================================================");
        Thread.sleep(3000);

        try {
            System.out.println("Try to open application");
            if (response.equals(null)){
                throw new NullPointerException();
            }

        }
        catch (Exception exception){
            exception.printStackTrace();

    }
        finally {
            Thread.sleep(300);
            System.out.println("====================================================");
            System.out.println("Closing connection");
            System.out.println("====================================================");

        }
        }


}
