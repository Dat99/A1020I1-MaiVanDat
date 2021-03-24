package Manager;

import commons.FileUtils;
import commons.FuncValidationService;
import models.Booking;
import models.Customer;
import models.Room;

import java.util.*;

import static Manager.BookingManager.FILE_NAME_BOOKING;

public class RoomMannager {

    private static ArrayList<Room> listRoom = new ArrayList<>();
    public static final String FILE_NAME_ROOM = "src\\data\\Room.csv";
    public static final String COMMA = ",";
    public static Scanner input = new Scanner(System.in);

    public static void addNewRoom(Room room) {
        // nhập id
        System.out.println("Nhập ID: ");
        String idRoomTemp = input.nextLine();
        while (!FuncValidationService.checkID(idRoomTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: SVRO-0000");
            idRoomTemp = input.nextLine();
        }
        room.setId(idRoomTemp);

        //Nhập tên dịch vụ
        System.out.println("Nhập Tên Dịch Vụ: ");
        String nameServicesRoomTemp = input.nextLine();
        while (!FuncValidationService.checkRoomServices(nameServicesRoomTemp)) {
            System.out.println("Invalid!!! please Input again!!! (ex: Room)");
            nameServicesRoomTemp = input.nextLine();
        }
        room.setNameServices(nameServicesRoomTemp);

        // nhập diện tích sử dụng
        System.out.println("Nhập Diện Tích Sử Dụng: ");
        String areaUseRoomTemp = input.nextLine();
        while (!FuncValidationService.checkArea(areaUseRoomTemp)) {
            System.out.println("Invalid!!! Area is larger 30!!!");
            areaUseRoomTemp = input.nextLine();
        }
        room.setArea(areaUseRoomTemp);

        // nhập chi phí thuê
        System.out.println("Nhập Chi Phí Thuê: ");
        String rentPriceRoomTemp = input.nextLine();
        while (!FuncValidationService.checkRentPrice(rentPriceRoomTemp)) {
            System.out.println("Invalid!!! Rent is positive numbers!!!");
            rentPriceRoomTemp = input.nextLine();
        }
        room.setRentPrice(rentPriceRoomTemp);

        //Nhập số lượng người tối đa
        System.out.println("Nhập Số Lượng Người Tối Đa: ");
        String maxNumberOfPeopleRoomTemp = input.nextLine();
        while (!FuncValidationService.checkMaxNumberOfPeople(maxNumberOfPeopleRoomTemp)) {
            System.out.println("Invalid!!! Max number of people must be greater than 0 and less than 20");
            maxNumberOfPeopleRoomTemp = input.nextLine();
        }
        room.setMaxNumberOfPeople(maxNumberOfPeopleRoomTemp);

        System.out.println("Kiểu thuê: ");
        String typeRentRoomTemp = input.nextLine();
        while(!FuncValidationService.checkTypeRent(typeRentRoomTemp)){
            System.out.println("Invalid!!! please Input again!!! (ex: Rent by hour,day,etc...)");
            typeRentRoomTemp = input.nextLine();
        }
        room.setTypeRent(typeRentRoomTemp);

        // dịch vụ miễn phí đi kèm
        System.out.println("Nhập Dịch Vụ Miễn Phí Đi Kèm: ");
        String freeServicesTemp = input.nextLine();
        while (!FuncValidationService.checkFreeServices(freeServicesTemp)) {
            System.out.println("Invalid!!! Free Services: Massage, Karaoke, Drink, Food, Car!!!");
            freeServicesTemp = input.nextLine();
        }
        room.setFreeServices(freeServicesTemp);
        listRoom.add(room);
        String line;
        for (Room room1 : listRoom) {
            line = room1.getId() + COMMA + room1.getNameServices() + COMMA + room1.getArea()
                    + COMMA + room1.getRentPrice() + COMMA + room1.getMaxNumberOfPeople()
                    + COMMA + room1.getTypeRent() + COMMA + room1.getFreeServices();
            FileUtils.writeFile(FILE_NAME_ROOM, line);
            break;
        }
    }

    // ---------------- Show All Room ----------------- //

    public static void showAllRoom() {
        listRoom = FileUtils.getFileCSVToListRoom();
        for (Room room : listRoom) {
            room.showInfor();
        }
    }

    // ---------------- Booking Room -----------------
    public static void bookingRoom(List<Booking> bookingList, List<Customer> customerList, Booking booking, int choose){
        List<Room> roomList = FileUtils.getFileCSVToListRoom();
        for (int i = 1; i < roomList.size(); i++) {
            System.out.print("ID: " + (i + 1) + " ");
            roomList.get(i).showInfor();
        }
        System.out.println("Choose one Room: ");
        int chooseRoom = input.nextInt();
        Room room = roomList.get(chooseRoom -1 );
        booking.setIdService(room.getId());
        bookingList.add(booking);
        String lineBooking;
        for (Booking booking1 : bookingList){
            lineBooking = booking1.getIdCustomer() + COMMA + booking1.getIdService();
            FileUtils.writeFile(FILE_NAME_BOOKING,lineBooking);
        }
        System.out.println("Đã Booking Room thành công cho khách hàng: " + customerList.get(choose -1 ).getNameCustomer());
    }

    // ---------------- Show All Name Room Not Duplicate ----------------- //

    public static void showAllNameRoomNotDup() {
        Set<String> nameRoomNotDup = new TreeSet<>();
        List<Room> roomList = FileUtils.getFileCSVToListRoom();
        for (int i = 0; i < roomList.size(); i++){
            nameRoomNotDup.add(roomList.get(i).getNameServices());
        }
        System.out.println("Danh sách các Room không trùng nhau: ");
        for (String nameRoom : nameRoomNotDup) {
            System.out.println(nameRoom);
        }
    }
}
