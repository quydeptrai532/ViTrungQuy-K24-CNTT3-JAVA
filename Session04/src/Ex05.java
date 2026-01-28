import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {

        // Giả lập nội dung file log
        String[] logs = {
                "2026-01-15 | user01 | BORROW | LIB-0001",
                "2026-01-16 | user02 | RETURN | LIB-0001",
                "2026-01-17 | user03 | BORROW | LIB-0002",
                "2026-01-18 | user01 | BORROW | LIB-0003"
        };

        // Regex với Capturing Groups
        String regex = "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*(\\w+)\\s*\\|\\s*(BORROW|RETURN)\\s*\\|\\s*(LIB-\\d+)";

        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                // Capturing Groups
                String date = matcher.group(1);
                String username = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                // In ra để kiểm tra
                System.out.println("Ngay: " + date);
                System.out.println("Nguoi dung: " + username);
                System.out.println("Hanh dong: " + action);
                System.out.println("Ma sach: " + bookId);
                System.out.println("---------------------");

                // Thống kê
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }

        // Kết quả thống kê
        System.out.println("Tong so lan BORROW: " + borrowCount);
        System.out.println("Tong so lan RETURN: " + returnCount);
    }
}
