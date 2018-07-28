package bb_customcompartors;

import b_methodreferences.Person;

import java.util.function.Function;

public class MainComparator {


    public static void main(String[] args) {

        Comparator<Person> cmpAge = (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());


        Person p1 = new Person(10, "a", "aa");
        Person p2 = new Person(100, "b", "bb");
        Person p3 = new Person(1_000, "c", "cc");

        System.out.println("compare ages: " + cmpAge.compare(p1, p2));
        System.out.println("compare first names: " + cmpFirstName.compare(p2, p3));
        System.out.println("compare last names: " + cmpLastName.compare(p3, p3));

        //as the above comparators have one thing in common (p1 and p2),
        // we can refactor and pass functions instead

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();

        Comparator<Person> cmpPerson = Comparator.comparePerson(f1);

        //or we can define the function in the param directly

        Comparator<Person> cmpPersonDirect = Comparator.comparePerson(Person::getAge);

        System.out.println("age aaa_stringprinter interface: " + cmpPerson.compare(p1, p2));
        System.out.println("age aaa_stringprinter interface directly: " + cmpPersonDirect.compare(p1, p2));

    }
}
