package com.workintech.cylinder;

public class Cylinder extends Circle{
    private double height;


    public Cylinder(int height, int radius){
        super(radius);
        if(height < 0){
          height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }


    public double getVolume(){
        return  super.getArea()*this.height;
    }


}
