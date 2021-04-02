package models;

public abstract class Services {
    private String id;
    private String nameServices; // tên dịch vụ
    private String area;// diện tích sử dụng
    private String rentPrice;// chí phí thuê
    private String maxNumberOfPeople; // số lượng người tối đa
    private String typeRent; // kiểu thuê


    public Services() {
    }

    public Services(String id, String nameServices, String area, String rentPrice, String maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.area = area;
        this.rentPrice = rentPrice;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(String maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return
                "id= " + id +"\n" +
                ", servicesName= " + nameServices + "\n" +
                ", area= " + area + "\n"+
                ", rentPrice=" + rentPrice + "\n" +
                ", maxNumberOfPeople= " + maxNumberOfPeople + "\n" +
                ", typeRent= " + typeRent;
    }

    public abstract void showInfor();

}

