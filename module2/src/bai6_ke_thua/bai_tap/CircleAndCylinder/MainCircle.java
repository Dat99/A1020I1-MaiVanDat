package bai6_ke_thua.bai_tap.CircleAndCylinder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 3);
        System.out.println(circle);
        System.out.println(circle.Area());

        Cylinder cylinder = new Cylinder("Green", 4, 2);
        System.out.println(cylinder);
        System.out.println(cylinder.Volume());
    }
}
