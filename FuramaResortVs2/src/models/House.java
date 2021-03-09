package models;

public class House extends Services{
    private String standardRoom;// tiêu chuẩn phòng
    private String facilitiesOther;// mô tả tiện nghi khác
    private  int numberOfFloors;// số tầng

    public House(String servicesName, double area, double money, int maximumPeople, String typeServices,
                 String standardRoom, String facilitiesOther, int numberOfFloors) {
        super(servicesName, area, money, maximumPeople, typeServices);
        this.standardRoom = standardRoom;
        this.facilitiesOther = facilitiesOther;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+"House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", facilitiesOther='" + facilitiesOther + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public void showInfor() {

    }

    public static void main(String[] args) {
        Services services = new House("house",12,100,23,
                "room"," 3 người","massage",7);


        House house = (House) services; //ép kiểu tường minh
        System.out.println(house.toString());
    }
}
