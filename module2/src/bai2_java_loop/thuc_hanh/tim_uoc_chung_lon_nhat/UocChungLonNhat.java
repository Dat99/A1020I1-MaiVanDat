package bai2_java_loop.thuc_hanh.tim_uoc_chung_lon_nhat;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a= input.nextInt();
        System.out.println("Enter b: ");
        int b=input.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        if(a ==0 || b==0){
            System.out.println("không có UCLN");
        }
        else{
            while(a!=b){
                if(a>b){
                    a=a-b;
                }else{
                    b=b-a;
                }
            }
        }
        System.out.println(a+" là UCLN");

    }
}
