package bai16_io_test_file.bai_tap.doc_file_csv;

public class Country {
private String id;
private String name;
private String startIp;
private String endIp;


    public Country(String id, String name, String startIp, String endIp) {
        this.id = id;
        this.name = name;
        this.startIp = startIp;
        this.endIp = endIp;
    }

    public Country() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartIp() {
        return startIp;
    }

    public void setStartIp(String startIp) {
        this.startIp = startIp;
    }

    public String getEndIp() {
        return endIp;
    }

    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

public void getInfor(){
    System.out.println("Name: "+this.name);
    System.out.println("Id: "+this.id);
    System.out.println("StartIp: "+this.startIp);
    System.out.println("EndIp: "+this.endIp);
}
    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startIp=" + startIp +
                ", endIp=" + endIp +
                '}';

    }

    public static void main(String[] args) {
        Country country = new Country("CN","China","1.0.0.0","1.0.0.255");
        country.getInfor();
    }
}
