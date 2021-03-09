package models;

import javax.xml.bind.annotation.XmlAnyAttribute;

public class Villa extends Services {
    private String standardRoom;// tiêu chuẩn phòng
    private String facilitiesOther;// mô tả tiện nghi khác
    private double areaPool;// diện tích hồ bơi
    private int numberOfFloors;// số tầng

    public Villa(String servicesName, double area, double money, int maximumPeople, String typeServices,
                 String standardRoom, String facilitiesOther, double areaPool, int numberOfFloors) {
        super(servicesName, area, money, maximumPeople, typeServices);
        this.standardRoom = standardRoom;
        this.facilitiesOther = facilitiesOther;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getFacilitiesOther() {
        return facilitiesOther;
    }

    public void setFacilitiesOther(String facilitiesOther) {
        this.facilitiesOther = facilitiesOther;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{"+
                "standardRoom='" + standardRoom + '\'' +
                ", facilitiesOther='" + facilitiesOther + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public void showInfor() {
    }

    public static void main(String[] args) {
        Services Villa = new Villa("Villa",23,120,12,"vip",
                "2 nguoi","karaoke",50,2);
        System.out.println(Villa.toString());
    }
}

