package ccc_chainpredicatefunctionalinterfaces;

import b_methodreferences.Person;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t);
    }

    default Predicate<T> or(Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }

//    static Predicate<String> isEqualTo(String string){
//        return s -> s.equals(string);
//    }

    static <U> Predicate<U> isEqualTo(U string){
        return s -> s.equals(string);
    }
}
