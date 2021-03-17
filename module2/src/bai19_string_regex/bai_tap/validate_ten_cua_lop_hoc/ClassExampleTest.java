package bai19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import bai19_string_regex.thuc_hanh.validate_account.AccountExample;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String[] validClass = new String[] { "C0318G" };
    public static final String[] invalidClass = new String[] { " M0318G", "P0323A" };

    public static void main(String args[]) {
        classExample = new ClassExample();
        for (String Class : validClass) {
            boolean isvalid = classExample.validate(Class);
            System.out.println("Class is " + Class +"is valid: "+ isvalid);
        }
        for (String Class: invalidClass) {
            boolean isvalid = classExample.validate(Class);
            System.out.println("Account is " + Class +" is valid: "+ isvalid);
        }
    }
}
