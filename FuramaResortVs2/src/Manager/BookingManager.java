package Manager;

import commons.FileUtils;
import models.Booking;
import models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Manager.HouseManager.bookingHouse;
import static Manager.RoomManager.bookingRoom;
import static Manager.VillaManager.bookingVilla;

public class BookingManager {
    public static final String FILE_NAME_BOOKING = "src\\data\\Booking.csv";
    private static final String COMMA = ",";
    private static boolean check;
    private static Scanner input = new Scanner(System.in);

    public static void addNewBooking() {
        List<Customer> customerList = FileUtils.getFileCSVToListCustomer();
        List<Booking> bookingList = new ArrayList<>();
        Collections.sort(customerList);
        Booking booking = new Booking();
        System.out.println("Thông tin khách hàng: ");
        for (int i = 1; i < customerList.size(); i++) {
            System.out.println("STT: " + i + " " + customerList.get(i).getNameCustomer() + " "
                    + customerList.get(i).getCardNumber() + " " + customerList.get(i).getDayOfBirth() + " "
                    + customerList.get(i).getPhoneNumber() + " " + customerList.get(i).getEmail());
        }
        System.out.println("Lựa chọn: ");
        int chooseCus = input.nextInt();
        Customer customer = customerList.get(chooseCus - 1);// lưu ý
        booking.setIdCustomer(customer.getCardNumber());
        do {
            System.out.println("--Menu add Booking--");
            System.out.println("1. Booking Villa" + "\n" +
                    "2. Booking House" + "\n" +
                    "3. Booking Room");
            System.out.println("---------------------------");
            System.out.println("Vui lòng chọn chức năng cần thực hiện: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    bookingVilla(bookingList, customerList, booking, chooseCus);
                    break;
                case 2:
                    bookingHouse(bookingList, customerList, booking, chooseCus);
                    break;
                case 3:
                    bookingRoom(bookingList, customerList, booking, chooseCus);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!!!");
                    addNewBooking();
            }
        } while (!check);
    }
}
