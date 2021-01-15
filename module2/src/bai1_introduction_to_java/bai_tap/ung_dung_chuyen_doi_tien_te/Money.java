package bai1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("Nhập tỉ giá USD muốn chuyển sang VND: ");
        Scanner scanner =new Scanner(System.in);
        int usd=scanner.nextInt();

        int rate = 23000*usd;
        System.out.println("Rate:"+rate);
    }
}
