package Ex03;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class MaBenhNhan {

    public static <T> List<T> findcommonpatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T e : listA) {
            if (listB.contains(e) && !result.contains(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // Trường hợp 1 - Integer
        List<Integer> khoaNoi1 = Arrays.asList(101, 102, 105);
        List<Integer> khoaNgoai1 = Arrays.asList(102, 105, 108);

        System.out.println("Common Integer: " +
                findcommonpatients(khoaNoi1, khoaNgoai1));

        // Trường hợp 2 - String
        List<String> khoaNoi2 = Arrays.asList("DN01", "DN02", "DN03");
        List<String> khoaNgoai2 = Arrays.asList("DN02", "DN04");

        System.out.println("Common String: " +
                findcommonpatients(khoaNoi2, khoaNgoai2));
    }
}