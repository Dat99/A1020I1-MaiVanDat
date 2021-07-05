package Manager;

import commons.FileUtils;
import commons.FuncValidationCustomer;
import controllers.MainController;
import libs.*;
import models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static commons.FileUtils.getFileCSVToListCustomer;

public class CustomerManager {
    public static final String FILE_NAME_CUSTOMER = "src\\data\\Customer.csv";
    public static final String COMMA = ",";
    private static ArrayList<Customer> listCustomer = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static boolean check;

    public static void addNewCustomer(Customer customer) {
        String fullName;
        String dateOfBirth;
        String gender;
        String email;
        String address;
        String typeCustomer;
        String phone;
        String idCard;
        // Name
        do {
            check = true;
            try {
                System.out.println("Họ và tên: ");
                fullName = input.nextLine();
                FuncValidationCustomer.checkNameCustomer(fullName);
                customer.setNameCustomer(fullName);
            } catch (NameException e) {
                System.err.println(e);
                check = false;
            }
        } while (!check);


        // ngày sinh
        do {
            check = true;
            try {
                System.out.println("Ngày tháng năm sinh: ");
                dateOfBirth = input.nextLine();
                FuncValidationCustomer.checkDayOfBirth(dateOfBirth);
                customer.setDayOfBirth(dateOfBirth);
            } catch (BirthdayException e) {
                System.err.println(e);
                check = false;
            }
        } while (!check);


        // gender
        do {
            check = true;
            try {
                StringBuilder tempGender = new StringBuilder();
                System.out.println("Giới tính: ");
                gender = input.nextLine().toLowerCase();
                FuncValidationCustomer.checkGender(gender);
                for (int i = 0; i < gender.length(); i++) {
                    if (i == 0) {
                        tempGender.append(gender.charAt(i));
                        tempGender = new StringBuilder(tempGender.toString().toUpperCase());
                        continue;
                    }
                    tempGender.append(gender.charAt(i));
                }
                customer.setGender(gender);
            } catch (GenderException e) {
                System.err.println(e);
                check = false;
            }
        } while (!check);


        // idCard
        do {
            check = true;
            try {
                System.out.println("CMND: ");
                idCard = input.nextLine();
                FuncValidationCustomer.checkCardNumber(idCard);
                customer.setCardNumber(idCard);
            } catch (IdCardException e) {
                System.err.println(e);
                check = false;
            }
        } while (!check);
        // phone
        System.out.println("SDT: ");
        phone = input.nextLine();
        customer.setPhoneNumber(phone);


        // email
        do {
            check = true;
            try {
                System.out.println("Email: ");
                email = input.nextLine();
                FuncValidationCustomer.checkEmail(email);
                customer.setEmail(email);
            } catch (EmailException e) {
                System.err.println(e);
                check = false;
            }
        } while (!check);
        check = true;
        // typeCustomer
        do {
            check = true;
            try {
                System.out.println("Loại khách hàng: ");
                typeCustomer = input.nextLine();
                FuncValidationCustomer.checkTypeCustomer(typeCustomer);
                customer.setTypeCustomer(typeCustomer);
            } catch (TypeCustomerException e) {
                System.err.println(e);
                check = false;
            }
        } while (!check);
        check = true;

        // address
        System.out.println("Địa chỉ: ");
        address = input.nextLine();
        customer.setAddress(address);
        listCustomer.add(customer);


        String line;
        for (Customer customer1 : listCustomer) {
            line = customer1.getNameCustomer() + COMMA + customer1.getDayOfBirth() + COMMA + customer1.getGender()
                    + COMMA + customer1.getCardNumber() + COMMA + customer1.getPhoneNumber()
                    + COMMA + customer1.getEmail() + COMMA + customer1.getTypeCustomer() + COMMA + customer1.getAddress();
            FileUtils.writeFile(FILE_NAME_CUSTOMER, line);
            break;
        }
        System.out.println("Thêm thành công Customer, Enter để tiếp tục!!!");
        input.nextLine();
        MainController.displayMainMenu();
    }

    public static void showInformationCustomers() {
        listCustomer = getFileCSVToListCustomer();
        Collections.sort(listCustomer);

        for (int i = 0; i < listCustomer.size(); i++) {
            listCustomer.get(i).showInfor();
        }
        MainController.displayMainMenu();

    }
}
