package bai6_ke_thua.thuc_hanh.Shape;

public class StudentBK extends Student {
    private String doAn;

    public StudentBK(String name, int id, int age, String doAn) {
        super(name, id, age);
        this.doAn = doAn;
    }

    public void getInfor(){
        super.getInfor();
        System.out.println("Do an: "+this.doAn);
    }
    public static void main(String[] args) {
        StudentBK studentBK =new StudentBK("Thuan", 1, 24,"Chuyen nganh");
        studentBK.getInfor();
    }
}
