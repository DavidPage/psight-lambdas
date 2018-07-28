package bb_customcompartors;

import b_methodreferences.Person;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

    static Comparator<Person> comparePerson(Function<Person, Integer> f1) {
        return (p1, p2) -> f1.apply(p1) - f1.apply(p2);
    }
}
