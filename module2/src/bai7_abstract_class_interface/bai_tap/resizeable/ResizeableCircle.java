package bai7_abstract_class_interface.bai_tap.resizeable;

import bai5_access_modifier.Resizeable;
import bai5_access_modifier.bai_tap.Circle;

public class ResizeableCircle extends Circle implements Resizeable{

    public ResizeableCircle() {
    }

    public ResizeableCircle(double r) {
        super(r);
    }

    @Override
    public void resize(double percent) {
            super.setRadius(Math.sqrt(1- percent/100)*super.getRadius());
    }

    public static void main(String[] args) {
        ResizeableCircle a = new ResizeableCircle(10);
        System.out.println(a.area());
        a.resize(10);
        System.out.println(a.area());
    }
}
