package bai5_access_modifier.bai_tap;

import bai5_access_modifier.Resizeable;

public  class Circle  {
    private double radius =1.0;
    private String color ="red";

    public Circle(){

    }
    public Circle(double r){
        this.radius= r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        return Math.PI*(this.radius)*(this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    
}
