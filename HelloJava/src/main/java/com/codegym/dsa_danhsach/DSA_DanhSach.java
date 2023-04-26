package com.codegym.dsa_danhsach;

import java.util.*;

public class DSA_DanhSach {
    public static void main(String[] args) {
        /**
        List<String> hinhhocs = new ArrayList<>();

        hinhhocs.add("Tròn");
        hinhhocs.add("Tam giác");
        hinhhocs.add("Vuông");
        hinhhocs.add("Tròn");
        hinhhocs.add("Thang");

        System.out.println(hinhhocs);


         Set<String> hinhhocs2 = new HashSet<>();
         hinhhocs2.add("Z");
         hinhhocs2.add("Tròn");
         hinhhocs2.add("Tam giác");
         hinhhocs2.add("A");
         hinhhocs2.add("Vuông");
         hinhhocs2.add("Tròn");
         hinhhocs2.add("Thang");

         System.out.println(hinhhocs2);

         Iterator<String> iterator = hinhhocs2.iterator();
         while (iterator.hasNext()) {
         System.out.println(iterator.next());
         }
         **/


        List<String> hinhhocs = new ArrayList<>();

        hinhhocs.add("Tròn");
        hinhhocs.add("Tam giác");
        hinhhocs.add("Vuông");
        hinhhocs.add("Tròn");
        hinhhocs.add("Thang");
//        System.out.println(hinhhocs);

        Set<String> hinhDaiDien = new HashSet<>();

        Set<String> hinhs = new HashSet<>();
        for (int i = 0; i < hinhhocs.size(); i++) {
            hinhDaiDien.add(hinhhocs.get(i));
        }
        // Giả sử hình hiện tại đang là hình vuông
        for (String item : hinhDaiDien) {
            if (!item.equals("Vuông")) {
                hinhs.add(item);
            }
        }

        for (String item : hinhs) {
            System.out.println(item);
        }


    }
}
