import java.util.*;
import java.util.regex.*;

public class Ex06 {
    public static void main(String[] args) {

        // ===== 1. Blacklist các từ nhạy cảm =====
        List<String> blacklist = Arrays.asList(
                "ngu",
                "xau",
                "te",
                "chan"
        );

        // ===== 2. Đánh giá mẫu =====
        String review = "Cuon sach nay rat te va noi dung hoi ngu. "
                + "Doc rat chan va khong phu hop voi nguoi moi hoc lap trinh. "
                + "Tuy nhien mot so phan giai thich van on neu doc ky hon.";

        // ===== 3. Tạo regex từ blacklist (không phân biệt hoa thường) =====
        // VD: (?i)\b(ngu|xau|te|chan)\b
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        // ===== 4. Thay thế từ nhạy cảm bằng **** đúng độ dài =====
        StringBuffer cleanReview = new StringBuffer();

        while (matcher.find()) {
            String badWord = matcher.group();
            String stars = "*".repeat(badWord.length());
            matcher.appendReplacement(cleanReview, stars);
        }
        matcher.appendTail(cleanReview);

        String result = cleanReview.toString();

        // ===== 5. Cắt ngắn nếu quá 200 ký tự (không cắt ngang từ) =====
        if (result.length() > 200) {
            int cutPos = result.lastIndexOf(" ", 200);
            if (cutPos == -1) {
                cutPos = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutPos));
            sb.append("...");

            result = sb.toString();
        }

        // ===== 6. In kết quả =====
        System.out.println("Danh gia sau khi xu ly:");
        System.out.println(result);
    }
}
