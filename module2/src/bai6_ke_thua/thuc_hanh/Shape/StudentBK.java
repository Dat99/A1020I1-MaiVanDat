package bai6_ke_thua.thuc_hanh.Shape;

public class StudentBK extends Student {
    private String doAn;

    public StudentBK(int id, String name, int age, String doAn) {
        super(id, name, age);
        this.doAn = doAn;
    }

    public void getInfor(){
        super.getInfor();
        System.out.println("Do an: "+this.doAn);
    }
    public static void main(String[] args) {
        StudentBK studentBK =new StudentBK(2, "Thuan", 24,"Chuyen nganh");
        studentBK.getInfor();
    }
}
