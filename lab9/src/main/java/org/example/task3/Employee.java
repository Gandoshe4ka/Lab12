package org.example.task3;

public abstract class Employee {
    protected String fullname;
    protected int id;

    public Employee(String fullname) {
        this.fullname = fullname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public abstract double getMonthlySalary();
}