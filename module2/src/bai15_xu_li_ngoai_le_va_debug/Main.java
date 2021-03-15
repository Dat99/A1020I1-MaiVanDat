package bai15_xu_li_ngoai_le_va_debug;

public class Main {
    public static void main(String[] args){
        try {
            Triangle triangle=new Triangle(3,6,3);
            System.out.println("ok");
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}
