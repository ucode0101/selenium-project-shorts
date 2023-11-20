package utility;

public class Waits {

    public static void wait(int seconds){
        try {
            Thread.sleep((long) seconds * 1000);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
