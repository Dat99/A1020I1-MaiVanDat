package models;

public class House extends Services{
    private String standardRoom; // tiêu chuẩn phòng
    private String describeConvenient; // tiện nghi khác
    private String numberOfFloors; // số tầng

    public House() {
    }

    public House(String standardRoom, String describeConvenient, String numberOfFloors) {
        this.standardRoom = standardRoom;
        this.describeConvenient = describeConvenient;
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
                        + "Number Of Floor: " + this.numberOfFloors + "\n"
                        + "----------------------------");
    }

}
