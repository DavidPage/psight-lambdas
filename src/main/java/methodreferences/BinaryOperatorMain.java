package methodreferences;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {

    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;

        System.out.println("sum of integers: " + sum.apply(2,4));

        BinaryOperator<Integer> sumByReferences = Integer::sum;

        System.out.println("sum of integers by references: " + sumByReferences.apply(2,4));


    }
}
