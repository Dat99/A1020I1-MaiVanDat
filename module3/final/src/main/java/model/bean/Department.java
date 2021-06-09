package model.bean;

public class Department {
    private String id;
    private String status;
    private String area;
    private String numberOfFloors;
    private String price;
    private String style;

    public Department() {
    }

    public Department(String id, String status, String area, String numberOfFloors, String price, String style) {
        this.id = id;
        this.status = status;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.price = price;
        this.style = style;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }''

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
