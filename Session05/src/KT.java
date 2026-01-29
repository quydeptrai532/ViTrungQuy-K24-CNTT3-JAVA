import java.util.Scanner;
import java.util.regex.Pattern;

public class KT {
    static  int MAX = 100;
    static String[] mssvList = new String[MAX];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    static  String MSSV_REGEX = "^B\\d{7}$";
    // Menu chức năng
    static void showMenu() {
        System.out.println("\n===== QUẢN LÝ MSSV =====");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV (Regex)");
        System.out.println("0. Thoát");
    }
    // Hiển thị tất cả mã sinh viên
    static void displayList() {
        if (count == 0) {
            System.out.println("Danh sách MSSV đang rỗng.");
            return;
        }

        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
    }

    // Thêm mới mã sinh viên
    static void addMSSV() {
        if (count >= MAX) {
            System.out.println("Mảng đã đầy, không thể thêm!");
            return;
        }

        String mssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            mssv = sc.nextLine();

            if (Pattern.matches(MSSV_REGEX, mssv)) {
                break;
            } else {
                System.out.println("Sai định dạng! MSSV phải có dạng Bxxxxxxx");
            }
        }

        mssvList[count] = mssv;
        count++;
        System.out.println("Thêm MSSV thành công!");
    }

    // Cập nhập mã sinh viên theo index
    static void updateMSSV() {
        if (count == 0) {
            System.out.println("Danh sách rỗng, không thể cập nhật.");
            return;
        }

        System.out.print("Nhập index cần sửa (0 - " + (count - 1) + "): ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index >= count) {
            System.out.println("Index không hợp lệ!");
            return;
        }

        String newMSSV;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newMSSV = sc.nextLine();

            if (Pattern.matches(MSSV_REGEX, newMSSV)) {
                break;
            } else {
                System.out.println("Sai định dạng MSSV!");
            }
        }

        mssvList[index] = newMSSV;
        System.out.println("Cập nhật MSSV thành công!");
    }
    // Xóa mã sinh viên
    static void deleteMSSV() {
        if (count == 0) {
            System.out.println("Danh sách rỗng, không thể xóa.");
            return;
        }
        System.out.print("Nhập MSSV cần xóa: ");
        String target = sc.nextLine();

        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Không tìm thấy MSSV cần xóa.");
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        mssvList[count - 1] = null;
        count--;

        System.out.println("Xóa MSSV thành công!");
    }

    // Tìm kiếm mã sinh viên theo chuỗi nhập vào
    static void searchMSSV() {
        if (count == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = sc.nextLine().toLowerCase().trim();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].toLowerCase().contains(keyword)) {
                System.out.println(mssvList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy MSSV phù hợp.");
        }
    }
    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addMSSV();
                    break;
                case 3:
                    updateMSSV();
                    break;
                case 4:
                    deleteMSSV();
                    break;
                case 5:
                    searchMSSV();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

}
