package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(double id, String name, double salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        System.out.println("Jr Developer starts to working");
    }
}
