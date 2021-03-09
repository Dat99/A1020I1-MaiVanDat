package models;

public class Room extends Services {
    private String servicesFree;

    public String getServicesFree() {
        return servicesFree;
    }

    public void setServicesFree(String servicesFree) {
        this.servicesFree = servicesFree;
    }

    public Room(String servicesName, double area, double money, int maximumPeople, String typeServices,
                String servicesFree) {
        super(servicesName, area, money, maximumPeople, typeServices);
        this.servicesFree = servicesFree;


    }

    @Override
    public void showInfor() {

    }

    public static void main(String[] args) {
        Services room =new Room("Room",23,3,23,"vip",
                "karaoke");
        System.out.println(room.getServicesName());
    }
}
