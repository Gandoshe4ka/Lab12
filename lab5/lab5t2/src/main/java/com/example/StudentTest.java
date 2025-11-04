package com.example;

import domain.UndergraduateStudent;
import domain.GraduateStudent;

public class StudentTest {
    public static void main(String[] args) {

        UndergraduateStudent undergrad = new UndergraduateStudent();
        undergrad.setStudentId(1001);
        undergrad.setName("Gavruk Tyoma");
        undergrad.setGroup("T-319");


        UndergraduateStudent undergrad2 = new UndergraduateStudent("Dima", 1002, "T-319");



        GraduateStudent grad = new GraduateStudent();
        grad.setStudentId(2001);
        grad.setName("Demidovich Andrew");

        System.out.println("Undergraduate Student:");
        System.out.println("ID: " + undergrad.getStudentId());
        System.out.println("Student: " + undergrad.getName());
        System.out.println("Group: " + undergrad.getGroup());

        System.out.println("\nGraduate Student:");
        System.out.println("ID: " + grad.getStudentId());
        System.out.println("Student: " + grad.getName());
    }
}