package com.codegym.utils;

import com.codegym.model.ERole;
import javafx.scene.transform.Scale;

import java.util.Scanner;

public class AppUtils {
    public static Scanner scanner = new Scanner(System.in);
    public static void menuOrderView(ERole eRole) {
        switch (eRole) {
            case ADMIN:
                System.out.println("Menu chương trình:");
                System.out.println("Nhập 1: Xem danh sách order");
                System.out.println("Nhập 2: Thêm order");
                System.out.println("Nhập 3: Xem chi tiết order");
                break;
            case USER:
                break;
        }

    }
    public static void menuProductView(ERole eRole) {

        switch (eRole) {
            case ADMIN:
                System.out.println("Menu chương trình:");
                System.out.println("Nhập 1: Xem danh sách sản phẩm");
                System.out.println("Nhập 2: Thêm sản phẩm");
                System.out.println("Nhập 3: Xóa sản phẩm");
                System.out.println("Nhập 4: Sắp xếp sản phẩm");
                System.out.println("Nhập 5: Tìm kiếm sản phẩm");
                System.out.println("Nhập 6: Đọc dữ liệu từ file");
                System.out.println("Nhập 7: Ghi dữ liệu xuống file");
                System.out.println("Nhập 8: Hiển thị sản phẩm có phân trang");
                System.out.println("Nhập 9: Sửa sản phẩm");
                break;
            case USER:
                System.out.println("Menu chương trình:");
                System.out.println("Nhập 1: Xem danh sách sản phẩm");
                System.out.println("Nhập 8: Hiển thị sản phẩm có phân trang");
                break;
        }

    }

    public static boolean checkContinue() {
        do {
            try {
                System.out.println("Bạn có muốn tiếp tục hay không");
                System.out.println("Nhập 1. Y");
                System.out.println("Nhập 2. N");
                int actionContinue = Integer.parseInt(scanner.nextLine());
                switch (actionContinue) {
                    case 1:
                        return true;
                    case 2:
                        return false;
                    default:
                        System.out.println("Nhập không đúng vui lòng nhập lại");

                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Định dạng không đúng. Vui lòng nhập lại");
            }
        } while (true);

    }
}
