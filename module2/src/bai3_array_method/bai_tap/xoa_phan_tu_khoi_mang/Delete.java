package bai3_array_method.bai_tap.xoa_phan_tu_khoi_mang;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8};
        int index=0;
        for(int i=index;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        System.out.println(Arrays.toString(array));
    }

}
