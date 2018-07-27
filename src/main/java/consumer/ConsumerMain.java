package consumer;

import java.util.function.Consumer;

public class ConsumerMain {


    public static void main(String[] args) {

        Consumer<String> mystring = s -> System.out.println(s);

        mystring.accept("print this!");


        Consumer<String> mystringReference = System.out::println;

        mystring.accept("print this too!");
    }
}
