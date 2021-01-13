package bai2_java_loop.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Image {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông(4 trường hợp)");
        System.out.println("3. In hình tam giác cân");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("height: ");
                int height = input.nextInt();
                System.out.println("width: ");
                int width = input.nextInt();

                System.out.println("Print a  " + height + " x " + width + " rectangle: ");

                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= height; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

            case 2:
                System.out.println("height: ");
                int a = input.nextInt();
                for(int i =1; i<=a;i++){
                    for(int j=i; j>=1;j--){
                        System.out.print(" * ");
                    }
                   System.out.println();
                }
                break;
            case 3:
                System.out.println("height: ");
                int n = input.nextInt();
                for(int i=1; i<=n;i++){
                    for(int j=i;j<=n;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;

        }
    }

}
