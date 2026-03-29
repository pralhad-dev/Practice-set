package InterviewPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateReturn {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,2,5,6,3,7);

        Set<Integer> seen  = new HashSet<>();

        List<Integer> result = list.stream()
                .filter(n -> !seen.add(n))
                .toList();

        System.out.println(result);

    }
}
