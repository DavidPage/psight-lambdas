package bbb_customcomparatorswithgenericparam;

import b_methodreferences.Person;

public class MainComparator {


    public static void main(String[] args) {

        Person p1 = new Person(10, "a", "aa");
        Person p2 = new Person(100, "b", "bb");
        Person p3 = new Person(1_000, "c", "cc");

        //Usage of the function reference by passing the Person::getAge to the Function<Comparable> params

        Comparator<Person> cmpPersonDirect = Comparator.comparePerson(Person::getAge);

        System.out.println("age aaa_stringprinter interface directly: " + cmpPersonDirect.compare(p1, p2));

    }
}
