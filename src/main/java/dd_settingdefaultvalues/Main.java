package dd_settingdefaultvalues;

import b_methodreferences.Person;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        Person p1 = new Person(28, "Alice", "blah");
        Person p2 = new Person(24, "Brian", "blah");
        Person p3 = new Person(27, "Chelsea", "blah");
        Person p4 = new Person(26, "David", "blah");
        Person p5 = new Person(22, "Erica", "blah");
        Person p6 = new Person(23, "Chico", "blah");

        City newyork = new City("New York");
        City shangai = new City("Shanghai");
        City paris = new City("Paris");

        Map<City, List<Person>> habitantsOfCities = new HashMap<>();

        System.out.println("People from paris: " + habitantsOfCities.get(paris)); // returns null as does not exist

        System.out.println("People from paris: " + habitantsOfCities.getOrDefault(paris, Collections.EMPTY_LIST)); // returns null as does not exist

        // if does not exist lets create a new one

        habitantsOfCities.putIfAbsent(paris, new ArrayList<>());
        habitantsOfCities.get(paris).add(p1);

        habitantsOfCities.computeIfAbsent(newyork, city -> new ArrayList<>()).add(p2);

        System.out.println("People from paris: " + habitantsOfCities.getOrDefault(paris, Collections.EMPTY_LIST)); // returns null as does not exist
        System.out.println("People from new york: " + habitantsOfCities.getOrDefault(newyork, Collections.EMPTY_LIST)); // returns null as does not exist

        habitantsOfCities.computeIfAbsent(newyork, city -> new ArrayList<>()).add(p3);
        System.out.println("People from new york: " + habitantsOfCities.getOrDefault(newyork, Collections.EMPTY_LIST)); // returns null as does not exist

    }
}
