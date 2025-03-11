package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] JuniorDeveloper;
    private MidDeveloper[] MidDeveloper;
    private SeniorDeveloper[] SeniorDeveloper;
    public HRManager(double id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper developer){
    if(index > JuniorDeveloper.length-1 || index < 0){
        System.out.println("Array index out of bounds!!");
    } else if (JuniorDeveloper[index] != null) {
        System.out.println("Index already assigned, try another!");
    } else {
        JuniorDeveloper[index] = developer;
    }

    }
    public void addEmployee(int index , MidDeveloper developer){
        if(index > MidDeveloper.length-1 || index < 0){
            System.out.println("Array index out of bounds!!");
        } else if (MidDeveloper[index] != null) {
            System.out.println("Index already assigned, try another!");
        } else {
            MidDeveloper[index] = developer;
        }
    }
    public void addEmployee(int index , SeniorDeveloper developer){
        if(index > SeniorDeveloper.length-1 || index < 0){
            System.out.println("Array index out of bounds!!");
        } else if (SeniorDeveloper[index] != null) {
            System.out.println("Index already assigned, try another!");
        } else {
            SeniorDeveloper[index] = developer;
        }

    }

}
