package org.madeeasy.stream;

import org.madeeasy.model.Employee;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://stackify.com/streams-guide-java-8/
 */

public class StreamApi {
    // empty stream creation of String
    Stream<String> emptyStringStream = Stream.empty();
    // collection stream
    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();
    // stream of array
    Stream<String> streamOfArray = Stream.of("q", "b");
    // stream using Stream.builder() method
    Stream<String> streamBuilder =
            Stream.<String>builder().add("a").add("b").add("c").build();
    //Stream.generate() method
    Stream<String> streamGenerated =
            Stream.generate(() -> "element").limit(10);

    public static void streamOfEmployeesOperation() {
        Integer[] employeesId = {1, 2, 3, 4, 5};
        List<Employee> employees = List.of(
                new Employee(1L, "pabitra", 5454.D, "CSE", true),
                new Employee(2L, "soumitra", 6666, "civil", false),
                new Employee(3L, "pranames", 65465, "EE", true),
                new Employee(4L, "ashok", 4512, "Farmer", true),
                new Employee(5L, "aparna", 1000, "no work", true)
        );
        List<Employee> emplyoees = employees.stream()
                .filter(employee -> employee.getSalary() > 5444.0)
                .map(employee -> {
                    if (employee.getDepartment().equals("CSE")) {
                        return new Employee(employee.getId(),
                                employee.getName(),
                                employee.getSalary() + 1000,
                                "CSE", false);
                    }
                    return employee;
                })
                .collect(Collectors.toList());
        //------------------OR---------------------------------
        /*List<Employee> emplyoees = employees.stream()
                .filter(employee -> employee.getSalary() > 5444.0)
                .map(employee -> {
                    if (employee.getDepartment().equals("CSE")) {
                        employee.setSalary(employee.getSalary() + 1000);
                    }
                    return employee;
                })
                .collect(Collectors.toList());*/
        System.out.println("emplyoees = " + emplyoees);

    }

    public static void main(String[] args) {
        streamOfEmployeesOperation();
    }

}
