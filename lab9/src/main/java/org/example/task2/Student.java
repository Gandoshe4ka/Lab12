package org.example.task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return String.format("Студент: Имя = '%s', Группа = '%s', Курс = %d, Cр. = %.2f}",
                name, group, course, getAverageGrade());
    }
}