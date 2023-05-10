package com.codegym.views;

import com.codegym.model.User;
import com.codegym.service.UserService;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private UserService userService;
    private Scanner scanner = new Scanner(System.in);

    public UserView() {
        userService = new UserService();
    }
    public void launcher() {
        do{
            System.out.println("Menu chương trình:");
            System.out.println("Nhập 1: Xem danh sách user");
            System.out.println("Nhập 2: Thêm user");


            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showUsers(userService.findAllUsers());
                    break;

            }
        }while (true);

    }

    private void showUsers(List<User> allUsers) {
        System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s", "ID", "NAME", "EMAIL","PASSWORD", "ROLE");
        for (int i = 0; i < allUsers.size(); i++) {
            User u = allUsers.get(i);
            System.out.printf("%-10s | %-20s | %-20s | %-20s | %-20s", u.getId(), u.getName(), u.getEmail(),u.getPassword(), u.geteRole());
        }
    }
}
