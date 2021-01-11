package bai1_introduction_to_java.thuc_hanh.tinh_chi_so_can_nang_cua_co_the;

import java.util.Scanner;

public class WeightIndex {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập lần lượt chỉ số cân nặng(kg) và chiều cao(m):");
        Scanner scanner=new Scanner(System.in);
        double weight=scanner.nextDouble();
        double height=scanner.nextDouble();

        double bmi= weight/Math.pow(height, 2);
        if(bmi<18){
            System.out.println(bmi+" is UnderWeight");
        }else if(bmi<25){
            System.out.println(bmi+" is Normal");
        } else if(bmi<30){
            System.out.println(bmi+ " is OverWeight");
        }else{
            System.out.println(bmi+ " is Obese");
        }


    }
}
