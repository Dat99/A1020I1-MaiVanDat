package bai5_access_modifier.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle.setColor("blue");
        System.out.println(circle.getColor());
    }

}
