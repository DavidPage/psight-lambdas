package cc_javautilfunctionpackage;

import b_methodreferences.Person;

import java.util.function.*;

public class PredicateMain {

    public static void main(String[] args) {

        Predicate<Person> isOld = p -> p.getAge() < 45;

        System.out.println("is person old?" + isOld.test(new Person(50)));

        System.out.println("is person old?" + isOld.test(new Person(20)));


        BiPredicate<Person, Integer> isPersonOlderThanX =  (p,i) -> p.getAge() > i;

        System.out.println("is person older than 20? " + isPersonOlderThanX.test(new Person(10), 20));


    }
}
