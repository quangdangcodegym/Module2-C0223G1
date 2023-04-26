package com.codegym.dsa_danhsach.baitap;



import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    public static List<Shape> shapes;
    public static void main(String[] args) {
        shapes = new ArrayList<>();

        shapes.add(new Circle(5, "RED", true));
        shapes.add(new Rectangle(4, 5, "RED", true));
        shapes.add(new Rectangle(5, 5, "RED", false));
        shapes.add(new Circle(6, "BLACK", false));
        shapes.add(new Rectangle(7, 1, "RED", true));
        shapes.add(new Triangle("RED", true, 7, 1, 6));


        /**
         Thêm 1 hình học: cho lựa chọn hình khi thêm
         Sửa 1 hình học
         Xóa 1 hình học tại vị trí index
         Sắp xếp các hình học tăng dần theo diện tích, theo màu, theo bán kính, theo tên
         Tính tổng diện tích của tất cả các hình
         Tính tổng diện tích của tất cả các hình có màu đỏ và đã được tô màu
         Tìm các hình học theo màu, theo trạng thái đã được tô hay chưa
         */

    }
}
