package Manager;

import commons.FileUtils;
import models.Employee;
import models.FilingCabinets;

import java.util.*;

import static controllers.MainController.displayMainMenu;

public class EmployeeManager {
    private static Scanner input = new Scanner(System.in);
    public static List<Employee> listEmployee = new ArrayList<>();
    private static final String COMMA = ",";
    public static final String FILE_NAME_EMPLOYEE = "src\\data\\Employee.csv";
    public static final String NEW_LINE = "\n";

    public static void showInformationOfEmployee() {
        boolean check = true;
        do {
            System.out.println("1. Thêm nhân viên" + "\n" +
                    "2. Hiển thị thông tin nhân viên" + "\n" +
                    "3. Tủ hồ sơ" + "\n" +
                    "4. Exit");
            String choose = input.nextLine();

            switch (choose) {
                case "1":
                    Employee employee = new Employee();
                    addEmployee(employee);
                    break;
                case "2":
                    showMapEmp();
                    break;
                case "3":
                    searchFillingCaninetsEmp();
                    break;
                case "4":
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Không tìm thấy chức năng");
            }
        } while (!check);
    }

    public static void addEmployee(Employee employee) {
        String idEmp;
        String nameEmp;
        String dofEmp;
        String addressEmp;
        String idCardEmp;
        String numberPhoneEmp;
        String emailEmp;
        String levelEmp;
        String dobEmp;
        String positionEmp;
        String salaryEmp;


        System.out.println("Id: ");
        idEmp = input.nextLine();
        employee.setIdEmp(idEmp);
        System.out.println("Họ và tên: ");
        nameEmp = input.nextLine();
        employee.setNameEmp(nameEmp);
        System.out.println("Ngày tháng năm sinh: ");
        dobEmp = input.nextLine();
        employee.setDofEmp(dobEmp);
        System.out.println("Địa chỉ: ");
        addressEmp = input.nextLine();
        employee.setAddressEmp(addressEmp);
        System.out.println("CMND: ");
        idCardEmp = input.nextLine();
        employee.setIdCardEmp(idCardEmp);
        System.out.println("Số điện thoại:");
        numberPhoneEmp = input.nextLine();
        employee.setNumberPhoneEmp(numberPhoneEmp);
        System.out.println("Email: ");
        emailEmp = input.nextLine();
        employee.setEmailEmp(emailEmp);
        System.out.println("Trình độ: ");
        levelEmp = input.nextLine();
        employee.setLevelEmp(levelEmp);
        System.out.println("Chức vụ: ");
        positionEmp = input.nextLine();
        employee.setPositonEmp(positionEmp);
        System.out.println("Tiền lương: ");
        salaryEmp = input.nextLine();
        employee.setSalaryEmp(salaryEmp);

        listEmployee.add(employee);
        String line;
        line = employee.getIdEmp() + COMMA + employee.getNameEmp() + COMMA + employee.getDofEmp() + COMMA + employee.getAddressEmp()
                + COMMA + employee.getIdCardEmp() + COMMA + employee.getNumberPhoneEmp() + COMMA + employee.getEmailEmp()
                + COMMA + employee.getLevelEmp() + COMMA + employee.getPositonEmp() + COMMA + employee.getSalaryEmp();
        FileUtils.writeFile(FILE_NAME_EMPLOYEE, line );
        FileUtils.writeFile(NEW_LINE, line );




    }

    public static void showMapEmp() {
        List<Employee> listEmp = FileUtils.getFileCSVToListEmployee();
        Map<String, Employee> mapEmp = new TreeMap<>();
        for (int i = 0; i < listEmp.size(); i++) {
            mapEmp.put(listEmp.get(i).getIdEmp(), listEmp.get(i));
        }
        for (Map.Entry<String, Employee> entry : mapEmp.entrySet()) {
            System.out.println("Id: " + entry.getKey() + "\n" + entry.getValue());
        }
    }

    public static void searchFillingCaninetsEmp() {
        List<Employee> listEmp = FileUtils.getFileCSVToListEmployee();
        FilingCabinets profile = new FilingCabinets();
        for (Employee emp : listEmp) {
            profile.add(emp);
        }
        System.out.println("Họ và tên: ");
        String name = input.nextLine();
        Employee employee = profile.search(name);
        if (profile.search(name) == null) {
            System.out.println("Can't found profile of: " + name);
        } else {
            System.out.println(employee);
        }
    }
}
