package bai3_array_method.them_phan_tu_vao_mang;

import java.util.Arrays;

public class PushElementArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8};
        int[] a=Arrays.copyOf(array, array.length+1);;
        int n=5;
        int index =3;
        for(int i=0;i<array.length;i++){
            if(i==index){
                a[i-1]=a[i];
                a[i]=a[a.length-1];

            }
        }

        a[a.length-1]=n;
        System.out.println(Arrays.toString(a));

    }
}