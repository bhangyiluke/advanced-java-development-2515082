package _02_02.before;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1, 5, 7};

        List<String> wordsList=arrayToList(words);
        List<Integer> numbersList = arrayToList(numbers);
        System .out.println(wordsList);
        System .out.println(numbersList);
    }

    private static <T> List<T> arrayToList(T[] array){
        return Arrays.asList(array);
    }





}
