package bai11_dsa_stack_queue.bai_tap.dao_nguoc_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Dao_nguoc_so_nguyen {
    public static void main(String[] args) {

        Stack<Integer> intStack =new Stack<Integer>();

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap kich thuoc cua mang:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kich thuoc vuot qua 20 phan tu");
        } while (size > 20);

        //push phan tu vao cho mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }





//        System.out.println("item 1: ");
//        int item1 = input.nextInt();

//        intStack.push(1);
//        intStack.push(2);
//        intStack.push(3);
//
//        System.out.println("Before 1: ");
//        System.out.println(intStack.peek());
//
//        System.out.println(intStack);
    }
}
