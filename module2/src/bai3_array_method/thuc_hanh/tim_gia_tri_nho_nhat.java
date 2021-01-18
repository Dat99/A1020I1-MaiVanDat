package bai3_array_method.thuc_hanh;

import javax.naming.PartialResultException;

public class tim_gia_tri_nho_nhat {
    public static int minValue(){
       int[] arr={1,2,3,4,5};
        int min=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
       return min;
    }

    public static void main(String[] args) {

        int index=minValue();
        System.out.println(index);
    }

}
