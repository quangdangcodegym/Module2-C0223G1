package com.codegym.utils;

import com.codegym.model.ECategory;
import com.codegym.model.IModel;
import com.codegym.model.Product;
import com.codegym.model.User;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtils {
    public static <T> void writeFile(String path, List<T> data) {
        try {
            FileWriter fileWriter = new FileWriter("./data/product.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (T item : data) {
                bufferedWriter.write(item.toString() +"\n");
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static <T> List<T> readFile(String path, Class<T> tClass) {

        List<T> datas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                Object obj = tClass.getDeclaredConstructor().newInstance();
                IModel<T> iModel = (IModel<T>) obj;
                iModel.parseData(line);

                datas.add((T) obj);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return datas;
    }
}
