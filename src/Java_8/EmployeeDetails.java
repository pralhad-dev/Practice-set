package Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Pralhad", 167000),
                new Employee("Palhad", 1000000),
                new Employee("Pg", 150000)
        );



        List<String> names =list.stream().filter(e1 -> e1.salary >50000).map(e->e.name).toList();

        System.out.println("NAme:"+names);
    }
}
