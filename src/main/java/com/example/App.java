package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Student student= new Student();
//        student.setId(20);
//        student.getId();
        Student student =context.getBean("student", Student.class);
//        student.setId(20);
//      student.getId();
//      student.getName();
//      student.getAge();
//        student.code();
        System.out.println(student.getName());
        for (Laptop l : student.getLaptops()) {
            System.out.println("Laptop Model: " + l.getModel());
        }

    }
}
