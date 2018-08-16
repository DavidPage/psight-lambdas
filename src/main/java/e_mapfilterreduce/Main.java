package e_mapfilterreduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> numbers2 = Arrays.asList(5, 6, 7, 8, 9);

        BinaryOperator<Integer> op = Integer::max;

        int reduction = reduce(numbers, 0, op);

        System.out.println("Reduction: " + reduction);

        // -- virtual paralellism here - Careful with non-associative operations! can provoke bugs when reducing
        int reduction1 = reduce(numbers1, 0, op);
        int reduction2 = reduce(numbers2, 0, op);
        int reduction3 = reduce(Arrays.asList(reduction1, reduction2), 0, op);

        System.out.println("Virtual paralell Reduction: " + reduction3);
    }

    private static int reduce(List<Integer> values, int valueIfEmpty, BinaryOperator<Integer> reduction) {

        int result = valueIfEmpty;

        for (int value : values) {
            result = reduction.apply(result, value);
        }
        return result;
    }
}
