package org.example.model;

import javax.annotation.PostConstruct;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private Map<Subject, Integer> grades;
    private boolean enrolled = false;

    public Student(String firstName, String lastName, Map<Subject, Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public Student() {
    }

    @PostConstruct
    public void init() {
        double averageGrade = grades.values().stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        setEnrolled(averageGrade >= 3.0);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<Subject, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<Subject, Integer> grades) {
        this.grades = grades;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                ", enrolled=" + enrolled +
                '}';
    }
}
