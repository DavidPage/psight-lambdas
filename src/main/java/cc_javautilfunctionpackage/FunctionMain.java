package cc_javautilfunctionpackage;

import b_methodreferences.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionMain {

    public static void main(String[] args) {

        Function<Person, Integer> ageMapper = Person::getAge;

        System.out.println(ageMapper.apply(new Person(100)));

        BiFunction<Person, Integer, String> bifunctionPerson = (p, v) -> "person age is : " + p.getAge() * v;

        System.out.println(bifunctionPerson.apply(new Person(1_000), 10));

        UnaryOperator<Person> personRapidAger = (p) -> new Person(p.getAge() * 50);

        System.out.println("person p have aged: " + personRapidAger.apply(new Person(10)).getAge());

    }
}
