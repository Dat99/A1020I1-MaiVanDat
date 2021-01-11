package bai1_introduction_to_java.thuc_hanh.giai_phuong_trinh_bac_nhat;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PhuongtrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as'a * x + b=0', please enter constants");

        Scanner scanner= new Scanner(System.in);
        // sử dụng thư viên scanner trong gói java.util để đọc giá trị người dùng nhậpvào
        System.out.println("a: ");
        double a=scanner.nextDouble();
        System.out.println("b: ");
        double b= scanner.nextDouble();

        if(a!=0){
            double result= -b/a;
            System.out.println("Phương trình có một nghiệm duy nhất là:"+result);
        }
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
