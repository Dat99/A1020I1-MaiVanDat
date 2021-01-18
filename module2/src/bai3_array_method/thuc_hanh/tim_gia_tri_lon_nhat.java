package bai3_array_method.thuc_hanh;

import java.util.Scanner;

public class tim_gia_tri_lon_nhat {
    public static void main(String[] args) {
        //khai báo, nhập và kiểm tra kích thước
        int size;
        double[] values;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
             size=scanner.nextInt();
            if(size>20){
                System.out.println("Kích thước vượt quá 20");
            }
        }while(size>20);
        // nhập giá trị cho các phần tử của mảng
        values=new double[size];
        int i=0;
        while(i<values.length){
            System.out.println("Enter elemnet "+(i+1)+" :");
            values[i]=scanner.nextInt();
            i++;
        }
        // In ra danh sách tài sản đã nhập
        System.out.println("Lists value: ");
        for(int j=0; j<values.length;j++){
            System.out.println(values[j]+"\t");
        }
        // duyệt các phần tử trong mảng để tìm GTLN
        double max=values[0];
        int index=0;
        for(int j=0;j<values.length;j++){
            if(values[j]>max){
                max =values[j];
                index =j+1;
            }
        }
        System.out.println("GTLN là: "+max+" có vị trí "+index+" trong danh sách");

    }
}
