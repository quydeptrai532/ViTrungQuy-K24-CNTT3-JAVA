import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the thu vien: ");
        String cardId = sc.nextLine();

        // Regex cho từng phần
        String prefixRegex = "^[A-Z]{2}";
        String yearRegex = "^[A-Z]{2}\\d{4}";
        String fullRegex = "^[A-Z]{2}\\d{4}\\d{5}$";

        // 1. Kiểm tra tiền tố
        if (!cardId.matches(prefixRegex + ".*")) {
            System.out.println("Loi: Thieu tien to TV");
        }
        // 2. Kiểm tra năm
        else if (!cardId.matches(yearRegex + ".*")) {
            System.out.println("Loi: Nam khong hop le");
        }
        // 3. Kiểm tra toàn bộ định dạng
        else if (!cardId.matches(fullRegex)) {
            System.out.println("Loi: Sai dinh dang ma the");
        }
        // 4. Hợp lệ
        else {
            System.out.println("Ma the hop le");
        }

        sc.close();
    }
}
