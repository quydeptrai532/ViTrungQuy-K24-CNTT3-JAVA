import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    // Class giao dịch
    static class Transaction {
        String bookId;
        String borrowDate;

        public Transaction(String bookId, String borrowDate) {
            this.bookId = bookId;
            this.borrowDate = borrowDate;
        }
    }

    public static void main(String[] args) {

        // 1. Tạo danh sách giao dịch
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("LIB-0001", "12/01/2026"));
        list.add(new Transaction("LIB-0002", "15/01/2026"));
        list.add(new Transaction("LIB-0003", "18/01/2026"));

        // ==============================
        // CÁCH 1: DÙNG TOÁN TỬ +
        // ==============================
        String report1 = "Thoi gian he thong: " + System.currentTimeMillis() + "\n";
        for (Transaction t : list) {
            report1 = report1 + t.bookId + " | " + t.borrowDate + "\n";
        }

        // ==============================
        // CÁCH 2: DÙNG STRINGBUILDER
        // ==============================
        StringBuilder report2 = new StringBuilder();
        report2.append("Thoi gian he thong: ")
               .append(System.currentTimeMillis())
               .append("\n");

        for (Transaction t : list) {
            report2.append(t.bookId)
                   .append(" | ")
                   .append(t.borrowDate)
                   .append("\n");
        }

        // ==============================
        // IN KẾT QUẢ
        // ==============================
        System.out.println("===== BAO CAO (+) =====");
        System.out.println(report1);

        System.out.println("===== BAO CAO (StringBuilder) =====");
        System.out.println(report2.toString());
    }
}
