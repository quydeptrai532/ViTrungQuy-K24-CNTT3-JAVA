package Ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 1000));
        // Anonymous Class - sort theo giá tăng dần
        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sắp xếp theo giá (Anonymous Class):");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("---------------------------");
        //  Lambda Expression - sort theo tên A-Z
        Collections.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("Sắp xếp theo tên (Lambda):");
        products.forEach(System.out::println);
    }
}