package bai19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean check=true;
        String REGEX_SDT="([84])-[0][0-9]{9}";
        while (check){
            System.out.println("Nhập số điện thoại: ");
            String input=scanner.nextLine();
            String kq=input.matches(REGEX_SDT)?"Đúng ":"Sai";
            System.out.println(kq);
            System.out.println("Số điện thoại bạn muốn nhập lại");
            String telephone =scanner.nextLine();
            if(telephone.equalsIgnoreCase("n"))
                check=false;
        }

    }
}
