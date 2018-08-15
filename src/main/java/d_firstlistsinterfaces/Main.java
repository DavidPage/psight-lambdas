package d_firstlistsinterfaces;

import b_methodreferences.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Person p1 = new Person(28, "Alice", "blah");
        Person p2 = new Person(24, "Brian", "blah");
        Person p3 = new Person(27, "Chelsea", "blah");
        Person p4 = new Person(26, "David", "blah");
        Person p5 = new Person(22, "Erica", "blah");
        Person p6 = new Person(23, "Chico", "blah");

        List<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

        people.forEach(System.out::println);

        System.out.println("-- delete people older than 25 --");
        people.removeIf(person -> person.getAge() > 25);

        people.forEach(System.out::println);

        System.out.println("-- Replace peoples name to uppercases --");

        people.replaceAll(person -> new Person(person.getAge(), person.getFirstName().toUpperCase(), person.getLastName().toUpperCase()));

        people.forEach(System.out::println);

        System.out.println("-- Sort people by ages --");

        people.sort(Comparator.comparing(Person::getAge).reversed());

        people.forEach(System.out::println);

    }
}
