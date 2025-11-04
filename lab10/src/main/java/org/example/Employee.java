package org.example;

public abstract class Employee {
    protected String fio;
    protected String position;
    protected double salary;

    public Employee(String fio, String position, double salary) throws OkladException {
        if (salary < 0) {
            throw new OkladException(salary);
        }
        this.fio = fio;
        this.position = position;
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateSalary();
}