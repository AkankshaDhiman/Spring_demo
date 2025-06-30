package com.example;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;

    private List<Laptop> laptops;

    public Student() {
        System.out.println("Student Constructor");
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor invoked");
    }

    public List<Laptop> getLaptops() {
        System.out.println("getter method for Laptops");
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    // other getters and setters...

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
