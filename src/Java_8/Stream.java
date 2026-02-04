package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3);

        numbers.stream().forEach(System.out::print);

        numbers.stream().filter(n -> n %2 ==0).forEach(System.out::println);

        List<String> names = Arrays.asList("Ajay, pralhad,john");

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        numbers.stream().distinct().sorted().forEach(System.out::println);


    }
}
