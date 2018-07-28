package bbbb_customcomparatorwithgenerics;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

    static <U> Comparator<U> comparePerson(Function<U, Comparable> f1) {
        return (p1, p2) -> f1.apply(p1).compareTo(f1.apply(p2));
    }

    default Comparator<T> thenComparing(Comparator<T> cmpCompare) {
        return (p1, p2) -> compare(p1, p2) == 0 ? cmpCompare.compare(p1, p2) : compare(p1, p2);
    }
}
