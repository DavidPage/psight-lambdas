package cc_javautilfunctionpackage;

import b_methodreferences.Person;

import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {

        /**
         *  Actually , the supplier is the reverse of a consumer:
         *  it does not accept any param and returns T
         */

        Supplier<String> supplier = () -> "blah";

        System.out.println(supplier.get());

        Supplier<Person> personSupplier = () -> new Person(10) ;

        System.out.println(personSupplier.get().getAge());
    }
}
