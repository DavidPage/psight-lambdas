package ccc_chainpredicatefunctionalinterfaces;

import b_methodreferences.Person;

public class Main {


    public static void main(String[] args) {

        Predicate<Person> olderThan20 = person -> person.getAge() > 20;
        Predicate<Person> youngerThan80 = person -> person.getAge() < 80;
        Predicate<Person> olderThan80 = person -> person.getAge() > 80;

        System.out.println("person older than 20? " + youngerThan80.test(new Person(20)));

        Predicate<Person> olderThan20AndYoungerThan80 = olderThan20.and(youngerThan80);

        System.out.println("older than 20 and younger than 80? " + olderThan20AndYoungerThan80.test(new Person(50)));

        Predicate<Person> olderThan20OROlderThan80 = olderThan80.or(olderThan20);

        System.out.println("older than 20 or younger than 80? " + olderThan20OROlderThan80.test(new Person(10)));


        Predicate<String> isYesEqualsToYes = Predicate.isEqualTo("Yes");

        System.out.println("Is Yes equals to Yes? " + isYesEqualsToYes.test("Yes"));
        System.out.println("Is No equals to Yes? " + isYesEqualsToYes.test("No"));

        Predicate<Integer> predicateEqualsTo20 = Predicate.isEqualTo(20);

        System.out.println("Is 10 equals to 20? " + predicateEqualsTo20.test(10));
        System.out.println("Is 20 equals to 20? " + predicateEqualsTo20.test(20));


    }
}
