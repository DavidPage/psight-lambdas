package f_streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        final Stream<Integer> stream = numbers.stream();

        stream.forEach(System.out::println);

        System.out.println(" ----- ");

        final Stream<Integer> streamOf = Stream.of(1, 2, 3, 4);

        streamOf.forEach(System.out::println);

        System.out.println(" ---Generate--- ");

        final Stream<String> streamOfOnes = Stream.generate(() -> "one");

        streamOfOnes.limit(5).forEach(System.out::println);

        System.out.println(" ---Iterate--- ");

        final Stream<String> streamOfPluses = Stream.iterate("+", (s) -> s + "+");

        streamOfPluses.limit(5).forEach(System.out::println);

        System.out.println(" ---Randomness--- ");

        final IntStream randomInts = ThreadLocalRandom.current().ints();

        randomInts.limit(5).forEach(System.out::println);


    }

}
