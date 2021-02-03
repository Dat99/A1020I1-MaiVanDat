package bai6_ke_thua.thuc_hanh.Shape;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void getInfor(){
        System.out.println("Name: "+this.name);
        System.out.println("Id: "+this.id);
        System.out.println("Age: "+this.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student=new Student("Dat",1,22);
        student.getInfor();

    }
}
