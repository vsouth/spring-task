package org.example.config;

import org.example.model.Student;
import org.example.model.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("org.example.model")
public class Context {
    @Bean
    public Student studentJill() {
        Map<Subject, Integer> grades = new HashMap<>();

        grades.put(Subject.ENGLISH, 2);
        grades.put(Subject.MATH, 2);
        grades.put(Subject.COMPUTER_SCIENCE, 2);

        return new Student("Jill", "Green", grades);
    }

    @Bean
    public Student studentAlice() {
        Map<Subject, Integer> grades = new HashMap<>();
        grades.put(Subject.ENGLISH, 3);
        grades.put(Subject.COMPUTER_SCIENCE, 3);
        grades.put(Subject.MATH, 2);
        return new Student("Alice", "White", grades);
    }

    @Bean
    public Student studentBob() {
        Map<Subject, Integer> grades = new HashMap<>();
        grades.put(Subject.ENGLISH, 5);
        grades.put(Subject.COMPUTER_SCIENCE, 5);
        grades.put(Subject.MATH, 5);
        return new Student("Bob", "Builder", grades);
    }
}
