package bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arrayList_linkedList;

import java.util.Scanner;

public class MainProduct {
    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("1. Thêm sản phẩm" + "\n" +
                    "2. Sửa thông tin sản phẩm theo id" + "\n" +
                    "3. Xoá sản phẩm theo id" + "\n" +
                    "4. Hiển thị danh sách sản phẩm" + "\n" +
                    "5. Tìm kiếm sản phẩm theo tên" + "\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá" + "\n"+
                    "7. Exit");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    Product  product = new Product();
                    addProduct(product);
                    break;
                case 2:
                    fixProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProduct();
                    break;
                case 5:
                    findProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có trong menu , hãy nhập lại");
                    break;
            }
        } while (check);
    }

    private static void findProduct() {
    }

    private static void sortProduct() {
    }

    private static void showProduct() {
    }

    private static void deleteProduct() {
    }

    private static void fixProduct() {
    }

    private static void addProduct(Product product) {
    }

    public static void main(String[] args) {
        mainMenu();
    }

}
