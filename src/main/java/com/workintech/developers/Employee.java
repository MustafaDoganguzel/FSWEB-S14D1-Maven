package com.workintech.developers;

public class Employee {
    private double id;
    private String name;
    private double salary;

    public Employee(double id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("Employee starts to working");
    }


}
