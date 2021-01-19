package bai4_oop.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//
//    public double getA() {
//        return a;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }
//
//    public double getC() {
//        return c;
//    }
//
//    public void setC(double c) {
//        this.c = c;
//    }
//
    public double getDiscriminant(){
        return (b*b)-(4*a*c);
    }

    public double getRoot1(){
        return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public  double getRoot2(){
        return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b= scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c=scanner.nextDouble();


        QuadraticEquation d= new QuadraticEquation(a, b, c);
//        System.out.println("aaa");
//        d.setA(scanner.nextInt());
        if(d.getDiscriminant()>0){
            System.out.println(d.getRoot1());
            System.out.println(d.getRoot2());
        } else if(d.getDiscriminant()==0){
            System.out.println(-b/2*a);
        }else{
            System.out.println("Vo nghiem");
        }

    }
}
