package org.example.task3;

public class FixedEmployee extends Employee {
    private final double salary;

    public FixedEmployee(String fullname, double salary) {
        super(fullname);
        this.salary = salary;
    }

    @Override
    public double getMonthlySalary() {
        return salary;
    }
}