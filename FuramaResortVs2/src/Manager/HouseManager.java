package Manager;

import commons.FileUtils;
import commons.FuncValidationService;
import models.Booking;
import models.Customer;
import models.House;

import java.util.*;

import static Manager.BookingManager.FILE_NAME_BOOKING;

public class HouseManager {
    private static List<House> listHouse = new ArrayList<>();
    public static final String FILE_NAME_HOUSE = "src\\data\\House.csv";
    public static final String COMMA = ",";
    public static Scanner input = new Scanner(System.in);

    public static void addNewHouse(House house) {
        //nhập tên id
        System.out.println("Nhập ID: ");
        String idHouseTemp = input.nextLine();
        while (!FuncValidationService.checkID(idHouseTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: SVHO-0000");
            idHouseTemp = input.nextLine();
        }
        house.setId(idHouseTemp);

        // nhập tên dịch vụ
        System.out.println("Nhập Tên DV: ");
        String nameServicesHouseTemp = input.nextLine();
        while (!FuncValidationService.checkHouseServices(nameServicesHouseTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: House)");
            nameServicesHouseTemp = input.nextLine();
        }
        house.setNameServices(nameServicesHouseTemp);

        //Nhập tên diên tích sử dụng
        System.out.println("Nhập Diện Tích Sử Dụng: ");
        String areaUseHouseTemp = input.nextLine();
        while (!FuncValidationService.checkArea(areaUseHouseTemp)) {
            System.out.println("Invalid!!! Area is larger 30!!!");
            areaUseHouseTemp = input.nextLine();
        }
        house.setArea(areaUseHouseTemp);

        //Nhập chi phí thuê
        System.out.println("Nhập Chi Phí Thuê: ");
        String rentPriceHouseTemp = input.nextLine();
        while (!FuncValidationService.checkRentPrice(rentPriceHouseTemp)) {
            System.out.println("Invalid!!! Rent is positive numbers!!!");
            rentPriceHouseTemp = input.nextLine();
        }
        house.setRentPrice(rentPriceHouseTemp);

        //Nhập số lượng người tối đa
        System.out.println("Nhập Số Lượng Người Tối Đa: ");
        String maxNumberOfPeopleHouseTemp = input.nextLine();
        while (!FuncValidationService.checkMaxNumberOfPeople(maxNumberOfPeopleHouseTemp)) {
            System.out.println("Invalid!!! Max number of people must be greater than 0 and less than 20");
            maxNumberOfPeopleHouseTemp = input.nextLine();
        }
        house.setMaxNumberOfPeople(maxNumberOfPeopleHouseTemp);

        //Nhập kiểu thuê
        System.out.println("Nhập Kiểu Thuê: ");
        String typeRentHouseTemp = input.nextLine();
        while (!FuncValidationService.checkTypeRent(typeRentHouseTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: Rent by hour,day,etc...)");
            typeRentHouseTemp = input.nextLine();
        }
        house.setTypeRent(typeRentHouseTemp);

        //Nhập tiêu chuẩn phòng
        System.out.println("Nhập Tiêu Chuẩn Phòng: ");
        String standardRoomHouseTemp = input.nextLine();
        while (!FuncValidationService.checkStandardRoom(standardRoomHouseTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: Vip, Business, Normal)");
            standardRoomHouseTemp = input.nextLine();
        }
        house.setStandardRoom(standardRoomHouseTemp);

        //Nhập mô tả  tiện nghi khác
        System.out.println("Nhập Mô Tả Tiện Nghi Khác: ");
        house.setDescribeConvenient(input.nextLine());

        //Nhập số tầng
        System.out.println("Nhập Số Tầng: ");
        String numberOfFloorsHouseTemp = input.nextLine();
        while (!FuncValidationService.checkNumberOfFloors(numberOfFloorsHouseTemp)) {
            System.out.println("Invalid!!! Number of floors is positive numbers!!!");
            numberOfFloorsHouseTemp = input.nextLine();
        }
        house.setNumberOfFloors(numberOfFloorsHouseTemp);


        listHouse.add(house);
        String line;
      for (House house1 : listHouse) { // bỏ forr each, tên đối tượng house1 sẽ thành house
            line = house1.getId() + COMMA + house1.getNameServices() + COMMA + house1.getArea()
                    + COMMA + house1.getRentPrice() + COMMA + house1.getMaxNumberOfPeople()
                    + COMMA + house1.getTypeRent() + COMMA + house1.getStandardRoom() + COMMA + house1.getDescribeConvenient()
                    + COMMA + house1.getNumberOfFloors();
            FileUtils.writeFile(FILE_NAME_HOUSE, line);
            break;  // bỏ break;
        }// bỏ
    }

    // ---------------- Show All House ----------------- //

    public static void showAllHouse() {
        listHouse = FileUtils.getFileCSVToListHouse();
        for (House house : listHouse) {
            house.showInfor();
        }
    }

    // ---------------- Booking House ----------------- //
    public static void bookingHouse(List<Booking> bookingList, List<Customer> customerList, Booking booking, int choose){
        List<House> houseList = FileUtils.getFileCSVToListHouse();
        for (int i = 1; i < houseList.size(); i++) {
            System.out.print("ID: " + (i + 1) + " ");
            houseList.get(i).showInfor();
        }
        System.out.println("Choose one House: ");
        int chooseHouse = input.nextInt();
        House house = houseList.get(chooseHouse -1 );
        booking.setIdService(house.getId());
        bookingList.add(booking);
        String lineBooking;
        for (Booking booking1 : bookingList){
            lineBooking = booking1.getIdCustomer() + COMMA + booking1.getIdService();
            FileUtils.writeFile(FILE_NAME_BOOKING,lineBooking);
        }
        System.out.println("Đã Booking House thành công cho khách hàng: " + customerList.get(choose -1 ).getNameCustomer());
    }

    // ---------------- Show All Name House Not Duplicate ----------------- //

    public static void showAllNameHouseNotDup() {
        Set<String> nameHouseNotDup = new TreeSet<>();
        List<House> houseList = FileUtils.getFileCSVToListHouse();
        for (int i = 0; i < houseList.size(); i++){
            nameHouseNotDup.add(houseList.get(i).getNameServices());
        }
        System.out.println("Danh sách các Room không trùng nhau: ");
        for (String nameHouse : nameHouseNotDup) {
            System.out.println(nameHouse);
        }
    }
}
