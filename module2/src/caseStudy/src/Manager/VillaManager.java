package Manager;

import commons.FileUtils;
import commons.FuncValidationService;
import models.Booking;
import models.Customer;
import models.Villa;

import java.util.*;

import static Manager.BookingManager.FILE_NAME_BOOKING;

public class VillaManager {
    public static final String FILE_NAME_VILLA = "src\\data\\Villa.csv";
    private static List<Villa> listVilla = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static final String COMMA = ",";

    public static void addNewVilla(Villa villa) {
        
        // nhập id
        System.out.println("Nhập ID: ");
        String idVillaTemp = input.nextLine();
        while (!FuncValidationService.checkID(idVillaTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: SVVL-0000");
            idVillaTemp = input.nextLine();
        }
        villa.setId(idVillaTemp);

        // Nhập tên dịch vụ
        System.out.println("Nhập Tên DV: ");
        String nameServicesVillaTemp = input.nextLine();
        while (!FuncValidationService.checkVillaServices(nameServicesVillaTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: Villa)");
            nameServicesVillaTemp = input.nextLine();
        }
        villa.setNameServices(nameServicesVillaTemp);
        
        //Nhập diện tích sử dụng
        System.out.println("Nhập Diện Tích Sử Dụng: ");
        String areaUseVillaTemp = input.nextLine();
        while (!FuncValidationService.checkArea(areaUseVillaTemp)) {
            System.out.println("Invalid!!! Area is larger 30!!!");
            areaUseVillaTemp = input.nextLine();
        }
        villa.setArea(areaUseVillaTemp + "");
        
        //Nhập chi phí thuê
        System.out.println("Nhập Chi Phí Thuê: ");
        String rentPriceVillaTemp = input.nextLine();
        while (!FuncValidationService.checkRentPrice(rentPriceVillaTemp)) {
            System.out.println("Invalid!!! Rent is positive numbers!!!");
            rentPriceVillaTemp = input.nextLine();
        }
        villa.setRentPrice(rentPriceVillaTemp);
        
        // Số lượng người tối đa
        System.out.println("Nhập Số Lượng Người Tối Đa: ");
        String maxNumberOfPeopleVillaTemp = input.nextLine();
        while (!FuncValidationService.checkMaxNumberOfPeople(maxNumberOfPeopleVillaTemp)) {
            System.out.println("Invalid!!! Max number of people must be greater than 0 and less than 20");
            maxNumberOfPeopleVillaTemp = input.nextLine();
        }
        villa.setMaxNumberOfPeople(maxNumberOfPeopleVillaTemp);
        
        //Nhập kiểu thuê
        System.out.println("Nhập Kiểu Thuê: ");
        String typeRentVillaTemp = input.nextLine();
        while (!FuncValidationService.checkTypeRent(typeRentVillaTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: Rent by hour,day,etc...)");
            typeRentVillaTemp = input.nextLine();
        }
        villa.setTypeRent(typeRentVillaTemp);
        
        //Nhập tiêu chuẩn phòng
        System.out.println("Nhập Tiêu Chuẩn Phòng: ");
        String standardRoomVillaTemp = input.nextLine();
        while (!FuncValidationService.checkStandardRoom(standardRoomVillaTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: Vip, Business, Normal)");
            standardRoomVillaTemp = input.nextLine();
        }
        villa.setStandardRoom(standardRoomVillaTemp);

        //Mô tả tiện nghi khác
        System.out.println("Nhập Mô Tả Tiện Nghi Khác: ");
        villa.setDescribeConvenient(input.nextLine());

        // Diện tích hồ bơi
        System.out.println("Nhập Diện Tích Hồ Bơi: ");
        String areaPoolVillaTemp = input.nextLine();
        while (!FuncValidationService.checkArea(areaPoolVillaTemp)) {
            System.out.println("Invalid!!! Area is larger 30!!!");
            areaPoolVillaTemp = input.nextLine();
        }
        villa.setAreaPool(areaPoolVillaTemp);
        System.out.println("Nhập Số Tầng: ");
        String numberOfFloorsVillaTemp = input.nextLine();
        while (!FuncValidationService.checkNumberOfFloors(numberOfFloorsVillaTemp)) {
            System.out.println("Invalid!!! Number of floors is positive numbers!!!");
            numberOfFloorsVillaTemp = input.nextLine();
        }
        villa.setNumberOfFloors(numberOfFloorsVillaTemp);
        listVilla.add(villa);
        String line;
        for (Villa villa1 : listVilla) {
            line = villa1.getId() + COMMA + villa1.getNameServices() + COMMA + villa1.getArea()
                    + COMMA + villa1.getRentPrice() + COMMA + villa1.getMaxNumberOfPeople()
                    + COMMA + villa1.getTypeRent() + COMMA + villa1.getStandardRoom() + COMMA + villa1.getDescribeConvenient()
                    + COMMA + villa1.getAreaPool() + COMMA + villa1.getNumberOfFloors();
            FileUtils.writeFile(FILE_NAME_VILLA, line);
        }

    }

    // ---------------- Show All Villa ----------------- //

    public static void showAllVilla() {
        listVilla = FileUtils.getFileCSVToListVilla();
        for (Villa villa : listVilla) {
            villa.showInfor();
        }
    }

    // ---------------- Booking Villa ----------------- //
    public static void bookingVilla(List<Booking> bookingList, List<Customer> customerList, Booking booking, int choose) {
        List<Villa> villaList = FileUtils.getFileCSVToListVilla();
        for (int i = 1; i < villaList.size(); i++) {
            System.out.print("ID: " + (i + 1) + " ");
            villaList.get(i).showInfor();
        }
        System.out.println("Choose one Villa: ");
        int chooseVilla = input.nextInt();
        Villa villa = villaList.get(chooseVilla - 1);
        booking.setIdService(villa.getId());
        bookingList.add(booking);
        String lineBooking;
        for (Booking booking1 : bookingList) {
            lineBooking = booking1.getIdCustomer() + COMMA + booking1.getIdService();
            FileUtils.writeFile(FILE_NAME_BOOKING, lineBooking);
        }
        System.out.println("Đã Booking Villa thành công cho khách hàng: " + customerList.get(choose).getNameCustomer());
    }


    // ---------------- Show All Name Villa Not Duplicate ----------------- //

    public static void showAllNameVillaNotDup() {
        Set<String> nameVillaNotDup = new TreeSet<>();
        List<Villa> villaList = FileUtils.getFileCSVToListVilla();
        for (int i = 0; i < villaList.size(); i++) {
            nameVillaNotDup.add(listVilla.get(i).getNameServices());
        }
        System.out.println("Danh sách các Villa không trùng nhau: ");
        for (String nameVilla : nameVillaNotDup) {
            System.out.println(nameVilla);
        }

    }
}
