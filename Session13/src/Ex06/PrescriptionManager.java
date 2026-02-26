package Ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrescriptionManager {

    static Scanner sc = new Scanner(System.in);
    static List<Medicine> list = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== MENU KE DON THUOC =====");
            System.out.println("1. Them thuoc");
            System.out.println("2. Dieu chinh so luong");
            System.out.println("3. Xoa thuoc");
            System.out.println("4. In hoa don");
            System.out.println("5. Tim thuoc gia re (<50000)");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }

    // 1️⃣ Thêm thuốc
    static void addMedicine() {
        System.out.print("Nhap ma thuoc: ");
        String id = sc.nextLine();

        for (Medicine m : list) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Thuoc da ton tai. Nhap so luong them: ");
                int addQty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + addQty);
                System.out.println("Da cong them so luong!");
                return;
            }
        }

        System.out.print("Nhap ten thuoc: ");
        String name = sc.nextLine();

        System.out.print("Nhap don gia: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int qty = Integer.parseInt(sc.nextLine());

        list.add(new Medicine(id, name, price, qty));
        System.out.println("Them thuoc thanh cong!");
    }

    // 2️⃣ Điều chỉnh số lượng
    static void updateQuantity() {
        System.out.print("Nhap ma thuoc: ");
        String id = sc.nextLine();

        for (Medicine m : list) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhap so luong moi: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    list.remove(m);
                    System.out.println("Da xoa thuoc khoi don.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Da cap nhat so luong.");
                }
                return;
            }
        }

        System.out.println("Khong tim thay thuoc!");
    }

    // 3️⃣ Xóa thuốc
    static void removeMedicine() {
        System.out.print("Nhap ma thuoc can xoa: ");
        String id = sc.nextLine();

        boolean removed = list.removeIf(m ->
                m.getDrugId().equalsIgnoreCase(id));

        if (removed) {
            System.out.println("Da xoa thuoc!");
        } else {
            System.out.println("Khong tim thay thuoc!");
        }
    }

    // 4️⃣ In hóa đơn
    static void printInvoice() {
        if (list.isEmpty()) {
            System.out.println("Don thuoc rong!");
            return;
        }

        double total = 0;

        System.out.println("\n===== HOA DON =====");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n",
                "Ma", "Ten", "Gia", "SL", "Thanh tien");

        for (Medicine m : list) {
            System.out.println(m);
            total += m.getTotal();
        }

        System.out.println("----------------------------------------------");
        System.out.println("Tong tien: " + total + " VND");

        // Xóa hết sau khi in
        list.clear();
        System.out.println("Don da duoc xoa sau khi in.");
    }

    // 5️⃣ Tìm thuốc giá rẻ
    static void findCheapMedicine() {
        boolean found = false;

        for (Medicine m : list) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co thuoc gia duoi 50000.");
        }
    }
}