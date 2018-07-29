package c_functionalinterfacesintroduction;

import java.util.function.Predicate;

public class Main {

    /**
     *
     * Functional interface - contains only one method
     * default methods are not abstract so do not count
     * static methods are not abstract so do not count
     * Methods from object class do not count either
     *
     * The annotation for @FunctionalInterface is optional and helps us understanding
     * if our functional interfaces do match all the criterias for functional interfaces
     * as mentioned above. The ide will help us identifying if the interface is good or not.
     *
     * See as in Predicate
     *
     */

    public static void main(String[] args) {

        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };

        //this can also be defined as:
        Predicate<String> sameAsAbove = s -> s.length() < 20;

        System.out.println(sameAsAbove.test("lessthan20"));

        //The
    }
}
