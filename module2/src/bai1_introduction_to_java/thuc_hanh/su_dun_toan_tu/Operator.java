package bai1_introduction_to_java.thuc_hanh.su_dun_toan_tu;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        //import lớp scanner từ lớp java.util

        System.out.println("Enter Width: ");
        width=scanner.nextFloat();
        System.out.println("Enter Height: ");
        height=scanner.nextFloat();

        float area=width* height;
        System.out.println("Area is: "+area);
    }
}
