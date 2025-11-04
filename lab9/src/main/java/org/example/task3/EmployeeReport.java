package org.example.task3;
import java.util.List;

public class EmployeeReport {

    public static void printSortedReport(List<Employee> employees) {
        System.out.println("a) Отчёт по сотрудникам (отсортировано):");
        System.out.println("----------------------------------------------");
        System.out.printf("%-5s %-20s %-15s%n", "ID", "ФИО", "Зарплата");
        System.out.println("----------------------------------------------");
        for (Employee emp : employees) {
            System.out.printf("%-5d %-20s %15.2f%n", emp.getId(), emp.getFullname(), emp.getMonthlySalary());
        }
        System.out.println("----------------------------------------------");
    }

    public static void printFirstFiveNames(List<Employee> employees) {
        System.out.println("\nb) Первые 5 имён работников:");
        employees.stream()
                .limit(5)
                .map(Employee::getFullname)
                .forEach(System.out::println);
    }

    public static void printLastThreeIds(List<Employee> employees) {
        System.out.println("\nc) Последние 3 идентификатора работников:");
        employees.stream()
                .skip(Math.max(0, employees.size() - 3))
                .map(Employee::getId)
                .forEach(System.out::println);
    }
}