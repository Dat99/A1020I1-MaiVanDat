package controllers;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import models.Customer;

import java.util.Scanner;

import static Manager.BookingManager.addNewBooking;
import static Manager.CustomerManager.addNewCustomer;
import static Manager.CustomerManager.showInformationCustomers;
import static Manager.EmployeeManager.showInformationOfEmployee;
import static Manager.ServicesManager.addNewServices;
import static Manager.ServicesManager.showServices;

public class MainController {

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        boolean check = true;

        do {
            System.out.println(
                            "-----Main Menu-----" + "\n" +
                            "1. Add New Services" + "\n" +
                            "2. Show Services" + "\n" +
                            "3. Add  New Customer" + "\n" +
                            "4. Show Information of Customer" + "\n" +
                            "5. Add New Booking" + "\n" +
                            "6. Show Information of Employee" + "\n" +
                            "7. Exit" + "\n"
            );

            System.out.print("Vui lòng chọn chức năng muốn thực hiện: \n ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    Customer customer = new Customer();
                    addNewCustomer(customer);
                    break;
                case 4:
                    showInformationCustomers();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("Fail!!! Please choose again, Enter to continue....");
                    input.nextLine();
                    displayMainMenu();
            }
        } while (check);
    }

}
