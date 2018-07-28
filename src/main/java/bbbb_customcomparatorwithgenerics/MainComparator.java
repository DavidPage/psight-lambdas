package bbbb_customcomparatorwithgenerics;

import b_methodreferences.Person;

public class MainComparator {


    public static void main(String[] args) {

        Person p1 = new Person(10, "a", "aa");
        Person p2 = new Person(10, "b", "bb");

        //Now using thenComparing to use different comparators depending on results

        Comparator<Person> cmpPersonAge = Comparator.comparePerson(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparePerson(Person::getLastName);

        Comparator<Person> cmpWithFallbackOnLastName = cmpPersonAge.thenComparing(cmpPersonLastName);

        // should fallback to comparelastName when as the ages are the same. returns -1 as last names diff
        System.out.println(cmpWithFallbackOnLastName.compare(p1, p2));

        Person p3 = new Person(10, "b", "aa");

        // should fallback to comparelastName when as the ages are the same. returns 0 as last names equal
        System.out.println(cmpWithFallbackOnLastName.compare(p1, p3));


    }
}
