package com.codegym.resizeabe;

import java.util.Arrays;

public class Paint {
    public static Shape[] shapes = new Shape[5];
    public static void main(String[] args) {


        shapes[0] = new Circle(5, "RED", true);
        shapes[1] = new Rectangle(4, 5, "RED", true);
        shapes[2] = new Rectangle(5, 5, "RED", false);
        shapes[3] = new Circle(6, "BLACK", false);
        shapes[4] = new Rectangle(7, 1, "RED", true);






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
    // Câu 3:
    public static void deleteShapesViews(){
        shapes = deleteShape(2, shapes);
    }
    // Câu 0:
    public static void resizeShapesView(Shape [] shapes) {
        System.out.println(Arrays.toString(shapes));
        resizeShapes(shapes);
        System.out.println(Arrays.toString(shapes));
    }
    public static void resizeShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(0.5);
        }
    }

    public static Shape[] deleteShape(int index, Shape[] shapes) {
        Shape[] shapesNew = new Shape[shapes.length - 1];
        for (int i = 0, j = 0; i < shapes.length; i++) {
            if (i == index) {
                continue;
            }
            shapesNew[j] = shapes[i];
            j++;
        }
        return shapesNew;
    }
}
