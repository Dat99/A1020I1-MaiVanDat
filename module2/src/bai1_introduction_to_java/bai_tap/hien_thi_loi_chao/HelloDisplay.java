package bai1_introduction_to_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class HelloDisplay {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner =new Scanner(System.in);
        String name= scanner.nextLine();

        System.out.println("Hello:"+ name);

    }
}
