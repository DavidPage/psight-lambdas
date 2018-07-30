package cc_javautilfunctionpackage;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;

public class PredefinedFunctinalInterfacesMain {


    public static void main(String[] args) {

        IntPredicate greaterThan20 = p -> p > 20;

        System.out.println(greaterThan20.test(10));

        IntFunction<String> stringifyInteger = p -> String.format("%d stringified", p);

        System.out.println(stringifyInteger.apply(10));

        IntToDoubleFunction doublifyFunction = p -> Double.valueOf(p);

        System.out.println(String.format("%.2f doublyfied into ", doublifyFunction.applyAsDouble(10)));

    }
}
