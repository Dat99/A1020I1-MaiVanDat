package bai1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Vui lòng nhập số muốn chuyển:");
//        Scanner scanner= new Scanner(System.in);
//        int number=scanner.nextInt();
        float a=1000;

        Locale locale = new Locale("vn");
        NumberFormat format =  NumberFormat.getCurrencyInstance(locale);
        System.out.println(format.format(a));
    }
}
