package Learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsMethods {
    //Limit, Count, Sort, Map
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = Arrays.asList("Array", "Brray", "Culinary", "Demographic");
        names.add("Adam");
        names.add("Ben");
        names.add("Azbano");
        names.add("Albano");
        names.add("Anie");
        names.add("Diego");
        names.add("Chris");
        names.add("Sam");

        System.out.println("Implementation of Stream function");
        long count = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(count);
        //Multiple Operations and Filters
        System.out.println("Implementation of Mutiple Operators and function");
        long multipleFilters = Stream.of("Adam", "Ben", "Diego", "Chris", "Sam", "Albano").filter((s ->
        {
            System.out.println(s.length());
            return s.startsWith("A") && s.contains("ba");
        })).count();
        System.out.println(multipleFilters);


        names.stream().forEach(s -> System.out.println(s));
        System.out.println("List After filter:");
        names.stream().filter((s ->
                (s.length() > 4))).limit(2).forEach(s -> System.out.println(s));


//Map Stream
        System.out.println("Implementation of Map function");
        names.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        System.out.println("Implementation of Sort function");
        names.stream().filter(s -> s.startsWith("A")).sorted().forEach(s -> System.out.println(s));

        Stream<String> newStream = Stream.concat(names.stream(), names2.stream());

        System.out.println("Concatenate Function");
//        newStream.forEach(s-> System.out.println(s));

        System.out.println("New Stream content validation:" + newStream.anyMatch(s -> s.equalsIgnoreCase("Adam")));


        System.out.println("Convert a list to uppercase");
        List<String> ls = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(ls);
        int countValues = 0;
        System.out.println("Distinct entries in list");
        List<Integer> distinctEntries = Arrays.asList(1, 5, 5, 9, 2, 3, 4, 6, 7, 8);
        distinctEntries.stream().distinct().sorted().forEach(s ->
                System.out.println(s));
        System.out.println("Distinct Count "+distinctEntries.stream().distinct().count());
    }

}