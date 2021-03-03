package bai2_java_loop.thuc_hanh.ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class    Money {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Số tiền gửi: ");
        double money=input.nextDouble();
        System.out.println("Số tháng gửi: ");
        int month= input.nextInt();
        System.out.println("Lãi suất: ");
        double interset_rate= input.nextDouble();

        double total_interset= 0;
        for(int i=0; i<month; i++){
            total_interset += money* (interset_rate/100)/12*month;
        }
        System.out.println(total_interset+" là số tiền lãi bạn nhận được sau "+month+ " tháng gửi");



    }
}
//Số_tiền_lãi = Số_tiền_gửi *
// tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi