package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductServiceImpl productService = new ProductServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println();
            System.out.println("===== QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Tìm sản phẩm theo tên");
            System.out.println("5. In danh sách sản phẩm");
            System.out.println("6. Sắp xếp theo giá tăng dần");
            System.out.println("7. Sắp xếp theo giá giảm dần");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");
            System.out.println();

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Product p = null;
                    productService.addProduct(p);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    productService.findByName(name);
                    break;
                case 5:
                    productService.fakeData();
                    productService.printProducts();
                    break;
                case 6:
                    productService.sortByPriceAsc();
                    break;
                case 7:
                    productService.sortByPriceDesc();
                    break;
                case 0:
                    System.out.println("Đã thoát!!");
            }

        } while(choice != 0);
    }
}
