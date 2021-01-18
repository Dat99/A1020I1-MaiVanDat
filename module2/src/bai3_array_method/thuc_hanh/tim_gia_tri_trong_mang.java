package bai3_array_method.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students={"Dat", "Thuan","Thong"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên sinh viên muốn tìm: ");
        String input_name=scanner.nextLine();

        boolean isExit= false;
        for(int i=0; i<students.length;i++){
          if(students[i].equals(input_name)){
              System.out.println("Học sinh " +input_name+" ở vị trí thứ "+(i+1)+" trong danh sách");
              isExit=true;
              break;
          }
        }
        if(!isExit){
            System.out.println("Không có tên trong danh sách");
        }
    }
    }

