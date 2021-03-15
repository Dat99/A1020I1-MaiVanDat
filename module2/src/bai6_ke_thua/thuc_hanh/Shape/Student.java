package bai6_ke_thua.thuc_hanh.Shape;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(int id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
        Student student=new Student(1,"Dat",22);
        student.getInfor();

    }
}
