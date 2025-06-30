package com.example;

public class Laptop {
    private String model;

    public Laptop() {
        System.out.println("non parameterized constructor of laptop class is invoked");
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
