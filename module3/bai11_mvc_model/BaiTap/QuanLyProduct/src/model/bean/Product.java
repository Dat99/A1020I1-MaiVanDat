package model.bean;

public class Product {
    private int id;
    private String name;
    private double price;
    private String describe;
    private String producer;
    private int quantity;
    private String color;

    public Product() {
    }

    public Product(String name, double price, String describe, String producer,int quantity,String color) {
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
        this.quantity =quantity;
        this.color =color;
    }

    public Product(int id, String name, double price, String describe, String producer,int quantity,String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
        this.quantity=quantity;
        this.color =color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
