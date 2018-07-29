package bbbbb_chaincustomcomparator;

import b_methodreferences.Person;

public class MainComparator {


    public static void main(String[] args) {

        Person p1 = new Person(10, "a", "aa");
        Person p2 = new Person(10, "b", "bb");

        //how to chain comparators

        Comparator<Person> chainedComparator = Comparator
                .comparePerson(Person::getAge)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getLastName);

        System.out.println(chainedComparator.compare(p1, p2));

    }
}
