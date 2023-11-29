package _java.Woche_03.Streams_07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Sorting out even numbers of the ArrayList

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers1.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        //Doubling of the ArrayList

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> doubleNumbers = numbers2.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println("Doubled numbers: " + doubleNumbers);

        //Sorting of the ArrayList

        List<Integer> numbers3 = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6, 5);
        List<Integer> sortedNumbers = numbers3.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted numbers: " + sortedNumbers);

        //Sum of the ArrayList

        List<Integer> numbers4 = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6, 5);
        int sum1 = numbers4.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println("Sum: " + sum1);

        //ForEach to see the process

        System.out.println("---");

        List<Integer> numbers5 = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6, 5);
        numbers5.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

        System.out.println("---");

        //Creating new list to collect the processed numbers

        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> newList = numbers6.stream()
                .filter(number -> number % 3 == 0)
                .map(number -> number * 3)
                .collect(Collectors.toList());

        System.out.println("New List: " + newList);
    }
}
