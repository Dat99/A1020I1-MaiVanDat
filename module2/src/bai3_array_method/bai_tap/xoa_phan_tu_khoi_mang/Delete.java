package bai3_array_method.bai_tap.xoa_phan_tu_khoi_mang;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int[] array={10,4,6,7,8,6};
        int index =3;
        System.out.println("Xóa phần tử ở vị trí: "+index);
        for(int i=0; i<array.length;i++){
            if(index==i){
                array[i]=array[i+1];
                array[i+1] = array[array.length - 1];
            }
        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));

    }

}
