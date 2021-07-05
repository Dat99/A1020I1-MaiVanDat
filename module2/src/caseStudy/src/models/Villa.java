package models;

import javax.xml.bind.annotation.XmlAnyAttribute;

public class Villa extends Services {

    private String standardRoom; // tiêu chuẩn phòng
    private String describeConvenient;// tiện nghi khác
    private String areaPool; // diện tích hồ bơi
    private String numberOfFloors;// số tầng

    public Villa() {
    }

    public Villa(String standardRoom, String describeConvenient, String areaPool, String numberOfFloors) {
        this.standardRoom = standardRoom;
        this.describeConvenient = describeConvenient;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescribeConvenient() {
        return describeConvenient;
    }

    public void setDescribeConvenient(String describeConvenient) {
        this.describeConvenient = describeConvenient;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfor() {

        System.out.println(
                super.toString()
                        + "Standard Room: " + this.standardRoom + "\n"
                        + "Describe Convenient: " + this.describeConvenient + "\n"
                        + "Area Pool: " + this.areaPool + "\n"
                        + "Number Of Floor: " + this.numberOfFloors + "\n"
                        + "----------------------------");
    }
}

