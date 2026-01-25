import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia sach (USD): ");
        double priceUSD = sc.nextDouble();
        System.out.print("Nhap ty gia: ");
        float rate = sc.nextFloat();
        double totalVND = priceUSD * rate;
        long total = (long) totalVND;
        System.out.println("Gia sach sau quy doi: " + total + " VND");
        sc.close();
    }
}
