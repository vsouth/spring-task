package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("professorBean")
public class Professor {
    @Value("Ivan")
    private String firstName;
    @Value("II")
    private String lastName;
    @Autowired
    private List<Student> students;

    public Professor(String firstName, String lastName, List<Student> students) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.students = students;
    }

    public Professor() {
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", students=" + students +
                '}';
    }
}
