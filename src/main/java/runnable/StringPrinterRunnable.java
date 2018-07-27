package runnable;

public class StringPrinterRunnable {


    public static void main(String[] args) {

        Runnable r = () -> {
            int i = 0;

            while (i++ < 10) {
                System.out.println("Works");
            }
        };

        r.run();
    }
}
   