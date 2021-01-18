package bai3_array_method.thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_cac_phan_tu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Enter a size: ");
             size = scanner.nextInt();
            if(size>20){
                System.out.println("Vượt quá kích thước của mảng là 20");
            }

        }while (size>20);
        // nhập giá trị cho các phần tử của mảng
        array =new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element "+(i+1)+":");
            array[i]=scanner.nextInt();
            i++;
        }
        //in ra mảng đã nhâp
        System.out.println("Element in array: ");
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }
       // đảo ngược thứ tự các phần tử trong mảng bằng cách sử dụng biến trung gian
        for(int j=0; j<array.length/2;j++){
            int temp=array[j];
            array[j]= array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println("Reverse array:");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
