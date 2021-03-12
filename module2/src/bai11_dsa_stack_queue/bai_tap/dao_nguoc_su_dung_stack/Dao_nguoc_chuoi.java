package bai11_dsa_stack_queue.bai_tap.dao_nguoc_su_dung_stack;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Dao_nguoc_chuoi {
    public static void reverseVer(String str) {
        String newStr="";
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        while (stack.size()>0){
            char ch= stack.pop();
            newStr+=ch;
        }
        System.out.printf("Sau khi đã đảo ngược: '%s' ",newStr);
    }
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập chuỗi cần đảo ngược vào đây:");
        String str=input.nextLine();
        reverseVer(str);
    }
}
