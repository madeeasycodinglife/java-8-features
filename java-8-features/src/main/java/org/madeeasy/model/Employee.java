package org.madeeasy.model;

public class Employee {
    private Long  id;
    private String name;
    private double salary;
    private String department;
    private boolean partTime;

    public Employee(Long id,
                    String name,
                    double salary,
                    String department,
                    boolean partTime) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.partTime = partTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", partTime=" + partTime +
                '}';
    }
}
