package commons;

import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    // ----------------- HEADER LINE  ---------------- //

    public static final String HEADER_LINE_VILLA = "id, nameServices, areaUse, rentPrice, maxNumberOfPeople" +
            ", typeRent, standardRoom, describeConvenient, areaPool, numberOfFloors " + "\n";
    public static final String HEADER_LINE_HOUSE = "id, nameServices, areaUse, rentPrice, maxNumberOfPeople" +
            ", typeRent, standardRoom, describeConvenient, numberOfFloors " + "\n";
    public static final String HEADER_LINE_ROOM = "id, nameServices, areaUse, rentPrice, maxNumberOfPeople" +
            ", typeRent, freeServices " + "\n";
    public static final String HEADER_LINE_CUSTOMER = "fullName, dayOfBirth, gender, cardNumber, phoneNumber, email, typeCustomer, address, services" + "\n";
    public static final String HEADER_LINE_EMPLOYEE = "id, fullName, dayOfBirth, address, idCard, phoneNumber, email, level, position, salary";

    // https://www.youtube.com/watch?v=WOOdgFiC_S4&t=2105s hướng dẫn ghi file csv

    // ----------------- Write Data Villa To File CSV ---------------- //
    public static void writeFile(String patchFile, String line) {
        try {
            // kiểm tra nếu file rỗng thì mới thêm header_line còn nếu đã có thì thực hiện thêm mỗi line.
            List<String> str = readFile(patchFile);
            if (str != null && str.size() == 0) {
                if (patchFile.equals("src\\data\\Villa.csv")) {
                    line = HEADER_LINE_VILLA + line;
                } else if (patchFile.equals("src\\data\\House.csv")) {
                    line = HEADER_LINE_HOUSE + line;
                } else if (patchFile.equals("src\\data\\Room.csv")) {
                    line = HEADER_LINE_ROOM + line;
                } else if (patchFile.equals("src\\data\\Customer.csv")) {
                    line = HEADER_LINE_CUSTOMER + line;
                }else if (patchFile.equals("src\\data\\Employee.csv")) {
                    line = HEADER_LINE_EMPLOYEE + line;
                }
            }

            FileWriter fileWriter = new FileWriter(patchFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // ----------------- Read Data File CSV ---------------- //
    public static List<String> readFile(String pathFile) {
        ArrayList<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }


    // ----------------- Read & Get Data Villa ---------------- //
    public static ArrayList<Villa> getFileCSVToListVilla() { // thử bỏ
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();

        try {
            String line;
            br = new BufferedReader
                    (new FileReader("src\\data\\Villa.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setNameServices(splitData[1]);
                villa.setArea(splitData[2]);
                villa.setRentPrice(splitData[3]);
                villa.setMaxNumberOfPeople(splitData[4]);
                villa.setTypeRent(splitData[5]);
                villa.setStandardRoom(splitData[6]);
                villa.setDescribeConvenient(splitData[7]);
                villa.setAreaPool(splitData[8]);
                villa.setNumberOfFloors(splitData[9]);
                listVilla.add(villa);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception exception) {
                exception.
            ();
            }

        }
        return listVilla;
    }

    // ----------------- Read & Get Data House ---------------- //
    public static ArrayList<House> getFileCSVToListHouse() {
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();

        try {
            String line;
            br = new BufferedReader
                    (new FileReader("src\\data\\House.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setNameServices(splitData[1]);
                house.setArea(splitData[2]);
                house.setRentPrice(splitData[3]);
                house.setMaxNumberOfPeople(splitData[4]);
                house.setTypeRent(splitData[5]);
                house.setStandardRoom(splitData[6]);
                house.setDescribeConvenient(splitData[7]);
                house.setNumberOfFloors(splitData[8]);
                listHouse.add(house);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        return listHouse;
    }

    // ----------------- Read & Get Data Room ---------------- //
    public static ArrayList<Room> getFileCSVToListRoom() {
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();

        try {
            String line;
            br = new BufferedReader
                    (new FileReader("src\\data\\Room.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setNameServices(splitData[1]);
                room.setArea(splitData[2]);
                room.setRentPrice(splitData[3]);
                room.setMaxNumberOfPeople(splitData[4]);
                room.setTypeRent(splitData[5]);
                room.setFreeServices(splitData[6]);
                listRoom.add(room);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        return listRoom;
    }

    // ----------------- Read & Get Data--------------- //
    public static ArrayList<Customer> getFileCSVToListCustomer() {
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader
                    (new FileReader("src\\data\\Customer.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("fullname")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitData[0]);
                customer.setDayOfBirth(splitData[1]);
                customer.setGender(splitData[2]);
                customer.setCardNumber(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                listCustomer.add(customer);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return listCustomer;
    }

    // ----------------- Read & Get Data Employee ---------------- //
    public static ArrayList<Employee> getFileCSVToListEmployee(){
        BufferedReader br = null;
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        try {
            String line;
            br = new BufferedReader
                    (new FileReader("src/data/Employee.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setIdEmp(splitData[0]);
                employee.setNameEmp(splitData[1]);
                employee.setDofEmp(splitData[2]);
                employee.setAddressEmp(splitData[3]);
                employee.setIdCardEmp(splitData[4]);
                employee.setNumberPhoneEmp(splitData[5]);
                employee.setEmailEmp(splitData[6]);
                employee.setLevelEmp(splitData[7]);
                employee.setPositonEmp(splitData[8]);
                employee.setSalaryEmp(splitData[9]);
                listEmployee.add(employee);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return listEmployee;
    }
}