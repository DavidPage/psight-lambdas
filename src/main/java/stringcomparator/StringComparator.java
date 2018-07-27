package stringcomparator;

import java.util.Comparator;

public class StringComparator {


    public static void main(String[] args) {

        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        System.out.println("comparator: " + comparator.compare("1", "2"));


        Comparator<String> returnableComparator = (s1, s2) ->
        {
            System.out.println("I am comparing strings");
            return Integer.compare(s1.length(), s2.length());
        };

        System.out.println("returnable comparator: " + returnableComparator.compare("1", "2"));
    }

}
