package models;

public class Room extends Services {
    private String freeServices; // dịch vụ miễn phí đi kèm

    public Room() {
    }

    public Room(String id, String servicesName, String area, String rentPrice, String maxNumberOfPeople,
                String typeRent, String freeServices) {
        super(id, servicesName, area, rentPrice, maxNumberOfPeople, typeRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }


    @Override
    public void showInfor() {
        System.out.println( super.toString()+ "freeServices= " +freeServices);

    }
}
