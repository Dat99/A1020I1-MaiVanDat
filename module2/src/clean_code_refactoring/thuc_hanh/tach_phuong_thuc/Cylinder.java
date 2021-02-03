package clean_code_refactoring.thuc_hanh.tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
//        double baseArea = Math.PI * radius * radius;
//        double perimeter = 2 * Math.PI  * radius;
//        double volume = perimeter * height + 2 * baseArea;
//        return volume;
        double baseArea = getBaseArea(radius); //tinh dien tich
        double perimeter = getPerimeter(radius); // tinh chu vi
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }
    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
