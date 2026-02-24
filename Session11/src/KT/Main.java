package KT;

public class Main {
    public static void main(String[] args) {

        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffe("CF01", "Bac siu", 30000, true);
        drinks[1] = new FruitJuice("FJ01", "Nuoc cam", 40000, 10);
        drinks[2] = null;

        for (Drink d : drinks) {
            if (d != null) {
                d.displayInfo();
                System.out.println("Thanh tien: " + d.calculatePrice());

                if (d instanceof IMixable) {
                    ((IMixable) d).mix();
                }

                System.out.println("------------------");
            }
        }
    }
}