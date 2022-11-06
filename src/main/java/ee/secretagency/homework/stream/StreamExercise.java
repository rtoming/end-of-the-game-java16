package ee.secretagency.homework.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("one");
        Arrays.asList("one", "two");
        var oldWayOfCreatingStringList = Arrays.asList("One", "Two");
//        oldWayOfCreatingStringList.add("Three");

        var persons = List.of(
          new Person("Mariuz1", "Pxx1", 39, 100),
          new Person("Mariuz2", "Pxx2", 40, 110),
          new Person("Mariuz3", "Pxx3", 41, 120),
          new Person("Mariuz4", "Pxx4", 42, 130)
        );

        // 1st challenge: make a collection with just names - loops approach
        List<String> justNames = new ArrayList<>(); //2
        for (var person : persons) { //1
            justNames.add(person.name()); //3
        }
        System.out.println("just names:" + justNames); //4


        // 2nd challenge: make a collection with names of people who are older than 40 years
        List<String> justOlder = new ArrayList<>();
        for (var person : persons) {
            if (person.age() > 40) {
                justOlder.add(person.name());
            }

        }
        System.out.println("just older than 40: " + justOlder);
        System.out.println("==== STREAM VS COLLECTION?! ====");
        System.out.println("NOW STREAMS!");

        var namesWithStream = persons.stream()
                .map(person -> person.name())
                //.toList() // since java 16th
                .collect(Collectors.toList());
        System.out.println("streams - just names " + namesWithStream);


        // 2nd part
        var olderPersonFilteredWithStream = persons.stream() // 1st stream
                .filter(person -> person.age() > 41) // 2nd stream - make completely new stream with that operation
                .map(person -> person.name())
                .toList();
        System.out.println("streams - older than 41 persons: " + olderPersonFilteredWithStream);


        // next exercise
        persons.stream()
                .filter(person -> person.age() < 40)
                .map(person -> person.height())
                .forEach(height -> System.out.println("person height in younger than 40: " + height));


        System.out.println();

        // exercise...
        persons.stream()
                .filter(person -> {
                    System.out.println("checking person: " + person);
                    return person.age() < 40;
                })
                .map(person -> {
                    System.out.println("mapping to names %s -> %s".formatted(person, person.name()));
                    return person.name();
                })
                .toList();




    } //MAIN

} //END
