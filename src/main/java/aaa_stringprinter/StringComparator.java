package aaa_stringprinter;

import java.util.Comparator;

public class StringComparator {


    public static void main(String[] args) {

        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        System.out.println("aaa_stringprinter: " + comparator.compare("1", "2"));


        Comparator<String> returnableComparator = (s1, s2) ->
        {
            System.out.println("I am comparing strings");
            return Integer.compare(s1.length(), s2.length());
        };

        System.out.println("returnable aaa_stringprinter: " + returnableComparator.compare("1", "2"));
    }

}
