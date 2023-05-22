package org.madeeasy.methodreference;

import org.madeeasy.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceOfStaticMethod {

    public static void main(String[] args) {
        new MethodReferenceOfStaticMethod().call();
    }

    public void call() {
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
                .map(MethodReferenceOfStaticMethod::modify)
                .collect(Collectors.toList());
    }
    private static Employee modify(Employee employee) {
        if (employee.getDepartment().equals("CSE")) {
            return new Employee(
                    employee.getId(),
                    employee.getName(),
                    employee.getSalary() + 1000.0,
                    "CSE",
                    false
            );
        }
        return employee;
    }
}
