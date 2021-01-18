package bai3_array_method.bai_tap.xoa_phan_tu_khoi_mang;

public class tim_phan_tu_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {

        double[][]array={{1,2,3,4},{5,6,7,8}};
        double max=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
                if(max<array[i][j]){
                    max=array[i][j];
                }
            }

        }
        System.out.println();
        System.out.println("max:"+max);
    }
}
