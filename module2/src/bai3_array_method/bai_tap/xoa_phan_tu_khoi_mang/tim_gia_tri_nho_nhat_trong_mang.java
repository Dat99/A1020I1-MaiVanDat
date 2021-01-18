package bai3_array_method.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[]array;
        int size;
        Scanner input =new Scanner(System.in);
        do{
            System.out.println("Enter a size:");
            size = input.nextInt();
            if(size>5){
                System.out.println("Vui long nhap lai(size<5)");
            }

        }while (size>5);

        // nhaap gia tri cac phan tu
        array=new int[size];
        int i=0;
        while(i<array.length){
            System.out.println("Enter elemnet "+(i+1)+" :");
            array[i]=input.nextInt();
            i++;
        }

        // in cac phan tu ra man hinh
        System.out.println("List array: ");
        for(int j=0; j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int min=array[0];
        for(int j=0; i<array.length;j++){
            if(array[j]<min){
                min=array[j];
            }
        }
        System.out.println();
        System.out.println("GTNN:"+min);


    }
}
