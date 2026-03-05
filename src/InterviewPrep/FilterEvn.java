package InterviewPrep;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEvn {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.stream().filter(n ->n %2==0).forEach(System.out::println);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        int max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);

        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(min);

        long count = list.stream().count();
        System.out.println(count);

        list.stream().sorted().forEach(System.out::println);

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        list.stream().distinct().forEach(System.out::println);

        list.stream().findFirst().ifPresent(System.out::println);

        list.stream().findAny().ifPresent(System.out::println);

        List<String> names = List.of("java","spring","kafka");

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        names.stream().filter(name -> name.startsWith("j")).forEach(System.out::println);

        int secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

        Map<Integer,Long> freq = list.stream().collect(Collectors.groupingBy(n->n,
                Collectors.counting()));
        System.out.println(freq);


        String longestSubStrream = names.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestSubStrream);
    }
}
