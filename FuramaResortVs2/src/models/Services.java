package models;

public abstract class Services {
    private String servicesName; // tên dịch vụ
    private double area;// diện tích sử dụng
    private double money;// chí phí thuê
    private int maximumPeople; // số lượng người tối đa
    private String typeServices; // kiểu thuê

    public Services(String servicesName, double area, double money, int maximumPeople, String typeServices) {
        this.servicesName = servicesName;
        this.area = area;
        this.money = money;
        this.maximumPeople = maximumPeople;
        this.typeServices = typeServices;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getTypeServices() {
        return typeServices;
    }

    public void setTypeServices(String typeServices) {
        this.typeServices = typeServices;
    }

    @Override
    public String toString() {
        return "Services{" +
                "servicesName='" + servicesName + '\'' +
                ", area=" + area +
                ", money=" + money +
                ", maximumPeople=" + maximumPeople +
                ", typeServices='" + typeServices + '\'' +
                '}';
    }

    public abstract void showInfor();

}

