package controllers;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        displayMainMenu();
        addNewServices();
    }

    public static void displayMainMenu() {
        System.out.println("You want to the choose. \n" +
                "1. Add New Services \n" +
                "2. Show Services \n" +
                "3. Add New Customer \n" +
                "4. Show Information of Customer \n" +
                "5. Add New Booking \n" +
                "6. Show Information of Employee \n" +
                "7. Exit");

        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationOfCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationOfEmployee();
                break;
            case "7":
                break;
            default:
                System.out.println("Fail! Please choose again. Enter to continue");
                sc.nextLine();
                displayMainMenu();

        }
    }

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
    }

    private static void addNewServices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to the choose. \n"+
                "1. Add New Villa \n"+
                "2. Add New House \n"+
                "3. Add New Room \n"+
                "4. Back to menu \n"+
                "5. Exit \n");
        sc.nextLine();
        displayMainMenu();

    }

}
