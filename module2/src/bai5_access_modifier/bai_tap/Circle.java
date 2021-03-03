package bai5_access_modifier.bai_tap;

 public   class Circle {
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    
}