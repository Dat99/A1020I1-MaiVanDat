package bai11_dsa_stack_queue.bai_tap.dao_nguoc_su_dung_stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class Dao_nguoc_chuoi {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();

        stringStack.push("Dat");
        stringStack.push("Thuan");
        stringStack.push("Thong");

        System.out.println("Before 1: ");
        System.out.println(stringStack.pop());

        System.out.println("Result: ");
        System.out.println(stringStack);

    }
}
