package com.codegym.dsa_danhsach.baitap;



import java.util.*;

public class ShapeManager {
    public static List<Shape> shapes;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        shapes = new ArrayList<>();

        shapes.add(new Circle(5, "RED", true)); // 0
        shapes.add(new Rectangle(4, 5, "RED", true));
        shapes.add(new Rectangle(5, 5, "RED", false));
        shapes.add(new Circle(6, "BLACK", false));      // 3
        shapes.add(new Rectangle(7, 1, "RED", true));
        shapes.add(new Triangle("RED", true, 7, 1, 6));


        printShapes(shapes);
        System.out.println("Nhập vị trí bạn muốn sửa ");
        int indexEdit = Integer.parseInt(scanner.nextLine());       // 3
        if (shapes.get(indexEdit) instanceof Circle) {
            System.out.println("Chọn 1: Cập nhật hình tròn. Chọn 2: Thay hình tròn bằng hình khác");
            int actionMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (actionMenuEdit) {
                case 1:
                    Circle circle = inputCircle();

                    Circle circlePresent = (Circle) shapes.get(indexEdit);
                    circlePresent.setFilled(circle.isFilled());
                    circlePresent.setRadius(circle.getRadius());
                    circlePresent.setColor(circle.getColor());
                    break;
                case 2:
                    changeDiferenceType(shapes,indexEdit, shapes.get(indexEdit).getClass().getSimpleName());
                    break;
            }
        }
        if (shapes.get(indexEdit) instanceof Rectangle) {
            System.out.println("Chọn 1: Cập nhật hình chữ nhật . Chọn 2: Thay hình chữ nhật bằng hình khác");
            int actionMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (actionMenuEdit) {
                case 1:
                    Rectangle rectangle = inputRectangle();
                    Rectangle rectanglePresent = (Rectangle) shapes.get(indexEdit);

                    rectanglePresent.setColor(rectangle.getColor());
                    rectanglePresent.setFilled(rectangle.isFilled());
                    rectanglePresent.setLength(rectangle.getLength());
                    rectanglePresent.setWidth(rectangle.getLength());
                    break;
                case 2:
                    changeDiferenceType(shapes, indexEdit, shapes.get(indexEdit).getClass().getSimpleName());
            }
        }
        if (shapes.get(indexEdit) instanceof Triangle) {
            System.out.println("Chọn 1: Cập nhật hình tam giác. Chọn 2: Thay hình tam giác bằng hình khác");
            int actionMenuEdit = Integer.parseInt(scanner.nextLine());
            switch (actionMenuEdit) {
                case 1:
                    Triangle triangle = inputTriangle();

                    Triangle trianglePresent = (Triangle) shapes.get(indexEdit);
                    trianglePresent.setColor(triangle.getColor());
                    trianglePresent.setFilled(triangle.isFilled());
                    trianglePresent.setSide1(triangle.getSide1());
                    trianglePresent.setSide2(triangle.getSide2());
                    trianglePresent.setSide3(triangle.getSide3());
                    break;
                case 2:
                    changeDiferenceType(shapes, indexEdit, shapes.get(indexEdit).getClass().getSimpleName());
            }
        }

        printShapes(shapes);


        /**
         * Sửa 1 hình học
         * 1 circle: radius, color, filled
         * sửa thành: Rectangle, Triangle
         Thêm 1 hình học: cho lựa chọn hình khi thêm
         Xóa 1 hình học tại vị trí index
         Sắp xếp các hình học tăng dần theo diện tích, theo màu, theo bán kính, theo tên
         Tính tổng diện tích của tất cả các hình
         Tính tổng diện tích của tất cả các hình có màu đỏ và đã được tô màu
         Tìm các hình học theo màu, theo trạng thái đã được tô hay chưa
         */

    }

    public static void printShapes(List<Shape> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }
    private static void changeDiferenceType(List<Shape> shapes,int indexEdit,  String simpleName) {
        System.out.println("Danh sách các hình khác: ");
        Set<String> typeChoosens = getTypeChoosens(shapes, simpleName);
        for (String item : typeChoosens) {
            System.out.println(item);
        }
        String actionDifferenceType = scanner.nextLine();
        switch (actionDifferenceType) {
            case "Rectangle":
                Rectangle rectangle = inputRectangle();
                shapes.set(indexEdit, rectangle);
                break;
            case "Circle":
                Circle c = inputCircle();
                shapes.set(indexEdit, c);
                break;
            case "Triangle":
                Triangle t = inputTriangle();
                shapes.set(indexEdit, t);
                break;
        }
    }

    private static Triangle inputTriangle() {
        System.out.println("Nhập thông tin tam giác: ");
        System.out.println("Nhập độ dài cạnh a: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh b: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh c: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Đã đô hay chưa: Y(đã tô) / N(chưa tô)");
        boolean filled = false;
        String sFilled = scanner.nextLine();
        if (sFilled.equalsIgnoreCase("Y")) {
            filled = true;
        }else{
            filled = false;
        }
        //String color, boolean filled, double side1, double side2, double side3
        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        return triangle;

    }

    private static Circle inputCircle() {
        System.out.println("Nhập thông tin Circle: ");
        System.out.println("Nhập bán kính: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Đã đô hay chưa: Y(đã tô) / N(chưa tô)");
        boolean filled = false;
        String sFilled = scanner.nextLine();
        if (sFilled.equalsIgnoreCase("Y")) {
            filled = true;
        }else{
            filled = false;
        }
        //double radius, String color, boolean filled)
        Circle circle = new Circle(radius, color, filled);
        return circle;
    }

    private static Rectangle inputRectangle() {
        System.out.println("Nhập thông tin hình chữ nhật: ");
        System.out.println("Nhập chiều dài: ");
        double w = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng:");
        double h = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Đã đô hay chưa: Y(đã tô) / N(chưa tô)");
        boolean filled = false;
        String sFilled = scanner.nextLine();
        if (sFilled.equalsIgnoreCase("Y")) {
            filled = true;
        }else{
            filled = false;
        }
        Rectangle rectangle = new Rectangle(w, h, color, filled);
        return  rectangle;
    }

    private static Set<String> getTypeChoosens(List<Shape> shapes, String simpleName) {
        Set<String> shapeTypes = new HashSet<>();       // ["Rectangle", "Circle", "Triangle"]
        for (int i = 0; i < shapes.size(); i++) {
            shapeTypes.add(shapes.get(i).getClass().getSimpleName());
        }

        Set<String> shapeTypeChoosens = new HashSet<>();    // ["Rectangle", "Triangle"];
        for (String item : shapeTypes) {
            if (!item.equalsIgnoreCase(simpleName)) {
                shapeTypeChoosens.add(item);
            }
        }
        return shapeTypeChoosens;
    }
}
