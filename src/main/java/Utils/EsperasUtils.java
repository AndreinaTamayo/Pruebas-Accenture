package Utils;

public class EsperasUtils {


    public static void twoseconds (){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
