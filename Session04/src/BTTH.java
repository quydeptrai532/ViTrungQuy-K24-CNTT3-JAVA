import java.util.Scanner;
import java.time.Year;

public class BTTH {

    // ===== PHẦN 2: Chuẩn hoá tên (tên sách / tác giả) =====
    public static String formatName(String input) {
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }

    // ===== PHẦN 3: Tạo chuỗi trích dẫn =====
    public static String buildCitation(String bookId, String title, String author, String year) {
        StringBuilder sb = new StringBuilder();
        sb.append(bookId)
                .append(" - ")
                .append(title)
                .append(" - ")
                .append(author)
                .append(" (")
                .append(year)
                .append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== NHẬP DỮ LIỆU =====
        System.out.print("Nhap ma sach: ");
        String bookId = sc.nextLine();

        System.out.print("Nhap ISBN: ");
        String isbn = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        String year = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String rawTitle = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String rawAuthor = sc.nextLine();

        // ===== PHẦN 1: KIỂM TRA REGEX =====
        String bookIdRegex = "^LIB-\\d{4}-S$";
        String isbnRegex = "^\\d{10}$";
        String yearRegex = "^\\d{4}$";

        int currentYear = 2026;

        boolean valid = true;

        if (!bookId.matches(bookIdRegex)) {
            System.out.println("Loi: Ma sach khong dung dinh dang (LIB-xxxx-S)");
            valid = false;
        }

        if (!isbn.matches(isbnRegex)) {
            System.out.println("Loi: ISBN phai gom dung 10 chu so");
            valid = false;
        }

        if (!year.matches(yearRegex) || Integer.parseInt(year) > currentYear) {
            System.out.println("Loi: Nam xuat ban khong hop le");
            valid = false;
        }

        if (!valid) {
            System.out.println("Du lieu khong hop le. Ket thuc chuong trinh.");
            return;
        }

        // ===== PHẦN 2: CHUẨN HOÁ =====
        String title = formatName(rawTitle);
        String author = formatName(rawAuthor);

        // ===== PHẦN 3: TẠO CHUỖI TRÍCH DẪN =====
        String citation = buildCitation(bookId, title, author, year);

        // ===== IN KẾT QUẢ =====
        System.out.println("\n=== THONG TIN SAU KHI XU LY ===");
        System.out.println("Ten sach: " + title);
        System.out.println("Tac gia : " + author);
        System.out.println("Trich dan: " + citation);

        sc.close();
    }
}
