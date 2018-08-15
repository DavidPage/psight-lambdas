package ddd_mergemaps;

import b_methodreferences.Person;
import dd_settingdefaultvalues.City;

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

        habitantsOfCities.computeIfAbsent(newyork, city -> new ArrayList<>()).add(p1);
        habitantsOfCities.computeIfAbsent(shangai, city -> new ArrayList<>()).add(p2);
        habitantsOfCities.computeIfAbsent(shangai, city -> new ArrayList<>()).add(p3);

        System.out.println("people living in newyork: " + habitantsOfCities.get(newyork));
        System.out.println("people living in shangai: " + habitantsOfCities.get(shangai));
        System.out.println("people living in paris: " + habitantsOfCities.get(paris));

        Map<City, List<Person>> habitantsOfCities2 = new HashMap<>();

        habitantsOfCities2.computeIfAbsent(shangai, city -> new ArrayList<>()).add(p4);
        habitantsOfCities2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
        habitantsOfCities2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);

        System.out.println("---");
        System.out.println("people living in shangai 2: " + habitantsOfCities2.get(shangai));
        System.out.println("people living in paris 2: " + habitantsOfCities2.get(paris));

        habitantsOfCities2.forEach(                                          //foreach
                (city, people) -> {                                         //keyvalue pair
                    habitantsOfCities.merge(                                //on habitants of cities 1, do merge
                            city, people,                                   // the result of this lambda
                            (peoplefrommap1, peoplefrommap2) -> {
                                peoplefrommap1.addAll(peoplefrommap2);      // peoplefrom map 1 adds peoplefrommap2
                                return peoplefrommap1;                      //and return it
                            });
                });

        System.out.println("---");
        System.out.println("habitants of map1 in newyork: " + habitantsOfCities.get(newyork));
        System.out.println("habitants of map1 in shangai: " + habitantsOfCities.get(shangai));
        System.out.println("habitants of map1 in paris: " + habitantsOfCities.get(paris));

    }
}
