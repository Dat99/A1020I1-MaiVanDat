package bai1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        // đọc số nguyên dương có tối đa 3 chữ số
        System.out.println("Số cần đọc là: ");
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();

        //đọc các số có 1 chữ số
        if(number> 0 && number<10){
            String numberToText;
            switch (number){
                case 1:
                    numberToText ="one";
                    break;
                case 2:
                    numberToText="two";
                    break;
                case 3:
                    numberToText="three";
                    break;
            }
        }

    }
}
