package bai6_ke_thua.bai_tap.CircleAndCylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(String color, double radius, int height) {
        super(color, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

   public double Volume(){
        return Math.PI*height*(getRadius()*getRadius());
   }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()
                +
                " ,height=" + height +
                '}';
    }
}
