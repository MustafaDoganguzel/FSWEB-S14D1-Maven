package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(double id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("Sr Developer starts to working");
    }
}
