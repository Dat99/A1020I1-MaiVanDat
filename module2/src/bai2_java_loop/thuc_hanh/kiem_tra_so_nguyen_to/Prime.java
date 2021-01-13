package bai2_java_loop.thuc_hanh.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();
        boolean check =true;

        if(number<2){
            System.out.println(number+" is not prime!");
        }
       else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                check = false;
                break;
            }
            if(check){
                System.out.println(number+" is a prime!");
            }else{
                System.out.println(number+" is not a prime!");
            }
        }

    }

}
