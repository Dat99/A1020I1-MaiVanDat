package bai2_java_loop.thuc_hanh.thiet_ke_menu_cho_ung_dung;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // tạo 1 đối tượng input thuộc lớp Scanner để nhập
        System.out.println("Menu");
        System.out.println("1. Vẽ hình tam giác");
        System.out.println("2.vẽ hình vuông");
        System.out.println("3.Vẽ hình chữ nhật");
        System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }


