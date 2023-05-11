package com.codegym.views;

import com.codegym.model.ECategory;
import com.codegym.model.ERole;
import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductServiceInFile;
import com.codegym.service.ProductServiceInMemory;
import com.codegym.utils.AppUtils;
import com.codegym.utils.DateUtils;
import com.codegym.utils.ValidateUtils;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private IProductService productService;

    public ProductView() {
        productService = new ProductServiceInFile();
    }

    public void launcher() {
        boolean checkActionContinue;
        do{
            AppUtils.menuProductView(ERole.ADMIN);
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showProducts(productService.findAllProducts());
                    break;
                case 2:
                    showCreateProduct();
                    break;
                case 9:
                    editProduct();
                    break;
            }
            checkActionContinue = AppUtils.checkContinue();

        }while (checkActionContinue);

    }


    private String inputNameProduct() {
        String name;
        do {
            System.out.println("Thêm san phẩm");
            System.out.println("Nhập tên:");
            name = scanner.nextLine();
            if (!ValidateUtils.isNameValid(name)) {
                System.out.println("Tên không đúng vui lòng nhập lại. Tên sản phẩm phải từ 8-15 kí tự");
            }else{
                break;
            }
        } while (true);

        return name;
    }
    private void editProduct() {
        Product product = inputIdProduct();
        if (product != null) {
            boolean checkActionEdit;
            do{
                checkActionEdit = false;
                System.out.println("Bạn muốn sửa thông tin gì: ");
                System.out.println("Nhập 1. Sửa Tên");
                System.out.println("Nhâp 2. Sửa mô tả");
                System.out.println("Nhập 3. Sửa giá");
                System.out.println("Nhập 0. Quay lại");
                int actionEdit = Integer.parseInt(scanner.nextLine());
                switch (actionEdit) {
                    case 1:
                        inputNameProduct(product);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 0:
                        checkActionEdit = false;
                        break;
                    default:
                        System.out.println("Nhập sai. Vui lòng nhập lại ");
                        checkActionEdit = true;
                }
            }while (checkActionEdit);

        }


    }

    private void inputNameProduct(Product product) {
        System.out.println("Thông tin sản phẩm hiện tại: ");
        System.out.println(product);

        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();

        product.setName(name);
        productService.editProduct(product.getId(), product);

        System.out.println("Sửa thành công: ");
        System.out.println(product);
    }

    private Product inputIdProduct() {
        Product product = null;
        boolean checkEditProductValid = false;
        do{
            try {
                System.out.println("Nhập id bạn muốn sửa:");
                long idProduct = Long.parseLong(scanner.nextLine());
                product = productService.findProduct(idProduct);
                if (product == null) {
                    System.out.println("Id sản phẩm không hợp lệ");
                    System.out.println("Chọn 1. Nhập lại");
                    System.out.println("Chọn 2. Quay lại");
                    int actionEditId = Integer.parseInt(scanner.nextLine());
                    switch (actionEditId) {
                        case 1:
                            checkEditProductValid = true;
                            break;
                        case 2:
                            checkEditProductValid = false;
                            break;
                    }
                }
            }catch (NumberFormatException numberFormatException){
                System.out.println("Id không đúng định dạng vui lòng nhập lại");
                checkEditProductValid = true;
            }

        }while (checkEditProductValid);

        return product;
    }

    private void showCreateProduct() {

        String name = inputNameProduct();

        System.out.println("Nhập mo ta: ");
        String description = scanner.nextLine();
        System.out.println("Nhap gia: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.println("Chon danh muc:");
        for (ECategory eCategory : ECategory.values()) {
            System.out.printf("Chon %-5s %-10s", eCategory.getId(), eCategory.getName());
        }
        int idCategory = Integer.parseInt(scanner.nextLine());
        ECategory eCategory = ECategory.getECategoryById(idCategory);

        //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
        Product p = new Product(System.currentTimeMillis() / 1000, name, description, price, new Date(), eCategory);
        productService.addProduct(p);

        showProducts(productService.findAllProducts());

    }

    private void showProducts(List<Product> allProducts) {

        System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", "ID", "Name", "Description", "Price", "Create at", "Category");
        for (Product p : allProducts) {
            //long id, String name, String description,float price, Date createAt, ECategory eCategory) {
            System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", p.getId(), p.getName(), p.getDescription(),
                    p.getPrice(), DateUtils.format(p.getCreateAt()), p.geteCategory());
        }
    }


}
