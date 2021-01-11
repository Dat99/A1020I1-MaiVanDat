package bai1_introduction_to_java.thuc_hanh.kiem_tra_nam_nhuan;

import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        System.out.println("Please enter year:");
        Scanner  scanner= new Scanner(System.in);
        int year= scanner.nextInt();
// cách 1
//        if(year % 4==0){
//            if(year %100==0){
//                if(year% 400==0){
//                    System.out.println(year+" là năm nhuận");
//                }else{
//                    System.out.println(year+" Không phải là năm nhuận");
//                }
//            }else{
//                System.out.println(year+" là năm nhuận");
//            }
//        }else{
//            System.out.println(year+ " không phải là năm nhuận");
//        }

// cách 2 clean code hơn bằng cách sử dụng kỉ thuật tách biến
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year%4 ==0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year%100==0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400=year%400 ==0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            }else{
                isLeapYear=true;
            }
        }

        if(isLeapYear){
            System.out.println(year+" là năm nhuận");
        }else{
            System.out.println(year+" không phải là năm nhuận");
        }

   }
   }
