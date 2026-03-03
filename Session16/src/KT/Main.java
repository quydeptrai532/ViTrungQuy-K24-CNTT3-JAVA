package KT;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductRepository newPro = new ProductRepository();
        newPro.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        newPro.add(new ElectronicProduct("E02", "Mouse", 500000, 6));
        newPro.add(new FoodProduct("F01", "Milk", 30000, 10));
        newPro.add(new FoodProduct("F02", "Bread", 20000, 5));

        System.out.println("Danh sach san pham ");
        for (Product p : newPro.findAll()) {
            p.displayInfo();
            System.out.println(" | Thanh tien: " + p.caculateFinalPrice());
        }
        System.out.println("\n Tim san pham E01 ");
        Product found = newPro.findById("E01");
        if (found != null) {
            found.displayInfo();
            System.out.println(" | Thanh tien: " + found.caculateFinalPrice());
        } else {
            System.out.println("Khong tim thay");
        }

        System.out.println("\nSap xep theo gia tang dan ");

        List<Product> list = newPro.findAll();
        Collections.sort(list, Comparator.comparingDouble(Product::getPrice));

        for (Product p : list) {
            p.displayInfo();
            System.out.println(" | Thanh tien: " + p.caculateFinalPrice());
        }

        System.out.println("\nThong ke ");

        int electronicCount = 0;
        int foodCount = 0;

        for (Product p : newPro.findAll()) {
            if (p instanceof ElectronicProduct) {
                electronicCount++;
            } else if (p instanceof FoodProduct) {
                foodCount++;
            }
        }

        System.out.println("ElectronicProduct: " + electronicCount);
        System.out.println("FoodProduct: " + foodCount);
    }
}