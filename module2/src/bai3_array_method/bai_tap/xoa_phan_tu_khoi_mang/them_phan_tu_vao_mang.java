package bai3_array_method.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Arrays;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
//        int []array=new int[10];
          int[]array={1,2,3,4,5,0,0,0,0};
          int index=0;
          int n=5;
//        for(int i=0;i<n;i++){
//            array[i]=i+1;
//        }
//        System.out.println("trước khi chèn");
//        for(int element: array){
//            System.out.print(element+" ");
//        }
        System.out.println();
        for(int i=n;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=15;
        System.out.println("Sau khi chèn");
        System.out.println(Arrays.toString(array));
    }

}
