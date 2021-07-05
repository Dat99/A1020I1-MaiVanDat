package libs;

public class TypeCustomerException extends Exception {
    public TypeCustomerException(){
        super("Phải là Diamond, Platinium, Gold, Silver hoặc Member");
    }

}
