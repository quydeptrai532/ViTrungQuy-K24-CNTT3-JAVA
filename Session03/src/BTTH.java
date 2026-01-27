import java.util.Scanner;

public class BTTH {

    static final int MAX = 100;
    static int[] ids = new int[MAX];
    static String[] titles = new String[MAX];
    static int[] quantities = new int[MAX];
    static int size = 0;

    static Scanner sc = new Scanner(System.in);

    // ===== MENU =====
    static void menu() {
        System.out.println("\n===== MENU QUAN LY SACH =====");
        System.out.println("1. Xem danh sach");
        System.out.println("2. Them sach moi");
        System.out.println("3. Cap nhat so luong");
        System.out.println("4. Xoa sach");
        System.out.println("5. Tim kiem sach");
        System.out.println("6. Sap xep theo so luong (giam dan)");
        System.out.println("0. Thoat");
        System.out.print("Chon: ");
    }

    // ===== HIEN THI =====
    static void showBooks() {
        if (size == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.printf("%-10s %-25s %-10s\n", "Ma", "Ten sach", "So luong");
        for (int i = 0; i < size; i++) {
            System.out.printf("%-10d %-25s %-10d\n",
                    ids[i], titles[i], quantities[i]);
        }
    }

    // ===== KIEM TRA MA TON TAI =====
    static int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (ids[i] == id)
                return i;
        }
        return -1;
    }

    // ===== THEM SACH =====
    static void addBook() {
        if (size == MAX) {
            System.out.println("Mang da day!");
            return;
        }

        System.out.print("Nhap ma sach: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findById(id) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }

        System.out.print("Nhap ten sach: ");
        String title = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int qty = sc.nextInt();

        ids[size] = id;
        titles[size] = title;
        quantities[size] = qty;
        size++;

        System.out.println("Them sach thanh cong!");
    }

    // ===== CAP NHAT SO LUONG =====
    static void updateQuantity() {
        System.out.print("Nhap ma sach: ");
        int id = sc.nextInt();

        int index = findById(id);
        if (index == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }

        System.out.print("Nhap so luong moi: ");
        quantities[index] = sc.nextInt();

        System.out.println("Cap nhat thanh cong!");
    }

    // ===== XOA SACH =====
    static void deleteBook() {
        System.out.print("Nhap ma sach: ");
        int id = sc.nextInt();

        int index = findById(id);
        if (index == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            ids[i] = ids[i + 1];
            titles[i] = titles[i + 1];
            quantities[i] = quantities[i + 1];
        }
        size--;

        System.out.println("Xoa sach thanh cong!");
    }

    // ===== TIM KIEM GAN DUNG =====
    static void searchBook() {
        sc.nextLine();
        System.out.print("Nhap tu khoa: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (titles[i].toLowerCase().contains(keyword)) {
                System.out.printf("%-10d %-25s %-10d\n",
                        ids[i], titles[i], quantities[i]);
                found = true;
            }
        }

        if (!found)
            System.out.println("Khong co sach phu hop!");
    }

    // ===== SAP XEP GIAM DAN THEO SO LUONG =====
    static void sortByQuantityDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (quantities[i] < quantities[j]) {
                    // swap quantity
                    int tq = quantities[i];
                    quantities[i] = quantities[j];
                    quantities[j] = tq;

                    // swap id
                    int ti = ids[i];
                    ids[i] = ids[j];
                    ids[j] = ti;

                    // swap title
                    String tt = titles[i];
                    titles[i] = titles[j];
                    titles[j] = tt;
                }
            }
        }
        System.out.println("Da sap xep!");
    }

    // ===== MAIN =====
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBooks();
                case 2 -> addBook();
                case 3 -> updateQuantity();
                case 4 -> deleteBook();
                case 5 -> searchBook();
                case 6 -> sortByQuantityDesc();
                case 0 -> System.out.println("Thoat chuong trinh!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
