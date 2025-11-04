package org.example;
import org.example.task3.Employee;
import org.example.task3.EmployeeReport;
import org.example.task3.HourlyEmployee;
import org.example.task3.FixedEmployee;
import org.example.task2.Student;
import org.example.task2.StudentService;
import org.example.task1.Vehicle;
import org.example.task1.Bus;
import org.example.task1.Car;
import org.example.task1.Bike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n|Задание №1|\n");
        task1();
        System.out.println("\n|Задание №2|\n");
        task2();
        System.out.println("\n|Задание №3|\n");
        task3();
    }

    public static void task1(){
        Map<String, Vehicle> vehicles = new HashMap<>();

        vehicles.put("Toyota Camry", new Car("Камри"));
        vehicles.put("Honda Civic", new Car("Цивик"));
        vehicles.put("Toyota LC 200", new Car("Крузак"));
        vehicles.put("Infinity fx", new Car("Финик"));
        vehicles.put("Yamaha R1", new Bike("R1"));
        vehicles.put("Mercedes Bus", new Bus("Citaro"));

        System.out.println("Ключи (названия транспортных средств):");
        for (String key : vehicles.keySet()) {
            System.out.println(key);
        }
        System.out.println("Значения: ");
        Set<Map.Entry<String, Vehicle>> set = vehicles.entrySet();
        for (Map.Entry<String, Vehicle> me : set) {
            System.out.println(me.getValue());
        }
    }

    public static void task2(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Гаврук А.А.", "Т-319", 3, Arrays.asList(4.5, 3.0, 5.0, 4.0)));
        students.add(new Student("Григоренко В.Р.", "Т-319", 3, Arrays.asList(3.0, 3.5, 3.0, 5.0)));
        students.add(new Student("Демидович А.И.", "Т-319", 3, Arrays.asList(3.5, 4.0, 4.5, 3.0)));
        students.add(new Student("Шикунец И.И.", "Т-319", 3, Arrays.asList(2.8, 2.9, 2.7, 2.6)));
        students.add(new Student("Слыш Д.В.", "Т-319", 3, Arrays.asList(5.0, 5.0, 4.5, 5.0)));

        System.out.println("До обработки: ");
        students.forEach(System.out::println);

        StudentService.processStudents(students);

        System.out.println("\nПосле обработки: (студенты переводятся на следующий курс): ");
        students.forEach(System.out::println);

        System.out.println();
        StudentService.printStudents(students, 4);
    }

    public static void task3() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FixedEmployee("Гаврук А.А.", 50000.0));
        employees.add(new FixedEmployee("Григоренко В.Р.", 55000.0));
        employees.add(new FixedEmployee("Демидович А.И.", 45000.0));
        employees.add(new FixedEmployee("Слыш Д.В.", 45000.0));

        employees.add(new HourlyEmployee("Жигилев А.В.", 300.0));
        employees.add(new HourlyEmployee("Колотов Д.П.", 350.0));
        employees.add(new HourlyEmployee("Трофимов Е.С.", 280.0));
        employees.add(new HourlyEmployee("Стефаненков Д.К.", 320.0));

        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).setId(i + 1);
        }

        employees.sort((e1, e2) -> {
            double diff = e1.getMonthlySalary() - e2.getMonthlySalary();
            if (Math.abs(diff) < 1e-6) {
                return e1.getFullname().compareTo(e2.getFullname());
            }
            return Double.compare(diff, 0);
        });

        EmployeeReport.printSortedReport(employees);
        EmployeeReport.printFirstFiveNames(employees);
        EmployeeReport.printLastThreeIds(employees);
    }
}