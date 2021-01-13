package bai2_java_loop.bai_tap.hien_thi_cac_so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class Display100Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        boolean check = true;
        String ketqua = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần hiển thị: ");
        int number = scanner.nextInt();
        
        while (count < number && num < 100) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ketqua += num + ", ";
                count++;
            }
            num++;
        }
        System.out.println(ketqua);
    }
}
