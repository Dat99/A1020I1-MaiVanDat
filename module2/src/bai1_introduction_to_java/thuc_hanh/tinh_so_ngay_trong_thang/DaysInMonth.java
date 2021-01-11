package bai1_introduction_to_java.thuc_hanh.tinh_so_ngay_trong_thang;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("Please enter the month: ");
        Scanner scanner = new Scanner(System.in);
        int month=scanner.nextInt();

        String daysInMonth; // dùng để khử mã lặp
        switch (month){
            case 2:
                daysInMonth="28 days or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth="31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth="30 days";
                break;
            default:
                daysInMonth="";
        }
        if(daysInMonth != ""){
            System.out.println("The month"+" "+month+" "+"has"+" "+daysInMonth);
        }else{
            System.out.println("Invalid input");
        }
    }
}
