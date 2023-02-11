package lesson_13;

public class Exception_06_BrowserConnection {
    public static void main(String[] args) throws InterruptedException{
        String response = null;
        System.out.println("====================================================");
        System.out.println("Opening browser");
        Thread.sleep(3000);
        System.out.println("====================================================");
        System.out.println("Trying to create connection");
        Thread.sleep(3000);
        System.out.println("====================================================");


        try {
            System.out.println("Try to open application");
            Thread.sleep(3000);
            if (response.equals(null)){
                throw new NullPointerException();
            }

        }
        catch (Exception exception){
            exception.printStackTrace();

    }
        finally {
            Thread.sleep(3000);
            System.out.println("====================================================");
            System.out.println("Closing connection.....");
            System.out.println("====================================================");
            Thread.sleep(3000);
            System.out.println("Closing browser.....");
            System.out.println("====================================================");
            Thread.sleep(3000);
            System.out.println("Browser was closed. Bye.....");

        }
        }


}
