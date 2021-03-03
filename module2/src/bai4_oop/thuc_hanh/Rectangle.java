package bai4_oop.thuc_hanh;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) { //phương thức khởi tạo
        this.width = width;
        this.height = height;
    }

    public double getArea()
    { // phương thức tính diện tích
        return this.width * this.height;
    }

    public double getPerimeter() { // phương thức tính chu vi
        return (this.width + this.height) * 2;
    }

    public String display() { //phương thúc hiển thị
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
