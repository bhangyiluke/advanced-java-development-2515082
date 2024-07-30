package _04_05.before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> fruit = Arrays.asList("apple", "pineapple", "banana", "pear", "strawberry");
        // List<String> capitalisedFruit = ;
        System.out.println(processWithoutStreams(fruit));
        System.out.println(processWithStreams(fruit));
    }

    static List<String> processWithoutStreams(List<String> fruit) {
        List<String> capitalisedFruit = new ArrayList<>();
        for (String item : fruit) {
            item = item.toUpperCase();
            if(item.startsWith("P"))
            {
                capitalisedFruit.add(item);
            }
        }
        Collections.sort(capitalisedFruit);
        return capitalisedFruit;
    }

    static List<String> processWithStreams(List<String> fruit) {
        return fruit.stream()
        .map(String::toUpperCase)
        .filter(i->i.startsWith("P"))
        .sorted()
        .collect(Collectors.toList());
    }
}
