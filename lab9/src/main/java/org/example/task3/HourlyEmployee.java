package org.example.task3;

public class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private static final int HOURS_PER_MONTH = 160;

    public HourlyEmployee(String fullname, double hourlyRate) {
        super(fullname);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate * HOURS_PER_MONTH;
    }
}