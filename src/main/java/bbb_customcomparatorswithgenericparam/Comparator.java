package bbb_customcomparatorswithgenericparam;

import b_methodreferences.Person;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

    static Comparator<Person> comparePerson(Function<Person, Comparable> f1) {
        return (p1, p2) -> f1.apply(p1).compareTo(f1.apply(p2));
    }

//
//    static Comparator<Person> comparePerson(Function<Person, Integer> f1) {
//        return (p1, p2) -> f1.apply(p1) - f1.apply(p2);
//    }
//
//   If we try to add this one, it will clash with the previous one as we are essentially passing
//    a function to the method and is effectively the same param as the above one.
//
//      static Comparator<Person> comparePerson(Function<Person, String> f1) {
//        return (p1, p2) -> f1.apply(p1).compareTo(f1.apply(p2));
//    }
}
