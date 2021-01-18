package bai3_array_method.bai_tap.xoa_phan_tu_khoi_mang;

public class gop_mang {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3, 4}, {5, 6, 7,8} };
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
        }
    }
}
