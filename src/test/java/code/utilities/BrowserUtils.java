package code.utilities;

public class BrowserUtils {
    public static void StateWait(int second){
        try{
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
