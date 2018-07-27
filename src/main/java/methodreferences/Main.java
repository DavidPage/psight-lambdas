package methodreferences;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Person, Integer> personage = person -> person.getAge();

        System.out.println("regular get age on person: " + personage.apply(new Person(100)));

        Function<Person, Integer> personagereferences = Person::getAge;

        System.out.println("get age on person by reference: " + personagereferences.apply(new Person(1000)));

    }
}
