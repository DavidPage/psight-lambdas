package cc_javautilfunctionpackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {

        //consumer app CONSUMES T and do returns nothing

        //Consumer<String> consumer = (s) -> System.out.println(s);
        Consumer<String> consumer = System.out::println;

        consumer.accept("blah");

        //same as consumer, but accepts 2 params
        BiConsumer<String,String> bifunction = (s,p) -> {
            String appended  = s.concat(p);
            System.out.println(appended);
        };

        bifunction.accept("cat", "dog");
    }

}
