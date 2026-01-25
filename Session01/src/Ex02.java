import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so ngay cham tre (n): ");
        int n = sc.nextInt();
        System.out.print("Nhap so luong sach muon (m): ");
        int m = sc.nextInt();
        double total = n * m * 5000;
        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }
        System.out.println("Tong tien phat: " + total + " VND");
        boolean khoaThe = total > 50000;
        System.out.println("Yeu cau khoa the: " + khoaThe);
        sc.close();
    }
}
