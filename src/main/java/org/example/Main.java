package org.example;

import org.example.config.Context;
import org.example.model.Professor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextXml = new ClassPathXmlApplicationContext("context.xml");
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(Context.class);

        Professor professorXml = (Professor) contextXml.getBean("professorBean");
        Professor professorJava = (Professor) contextJava.getBean("professorBean");

        System.out.printf("Professor from XML context:%n%s%n", professorXml);
        System.out.printf("Professor from java context:%n%s%n", professorJava);
    }
}