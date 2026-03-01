package Ex05;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PhanLoaiUuTien {
    public static void main(String[] args) {

        Set<Patient> set = new TreeSet<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                //  So sánh severity trước (nhỏ hơn ưu tiên hơn)
                if (p1.getSeverity() != p2.getSeverity()) {
                    return p1.getSeverity() - p2.getSeverity();
                }

                // ️ Nếu cùng severity → so sánh arrivalTime
                return p1.getArrivalTime().compareTo(p2.getArrivalTime());
            }
        });

        // Thêm bệnh nhân
        set.add(new Patient("A", 3, "08:00"));
        set.add(new Patient("B", 1, "08:15"));
        set.add(new Patient("C", 1, "08:05"));

        // In kết quả
        for (Patient p : set) {
            System.out.println(
                    p.getName() + " - Mức: " + p.getSeverity() +
                            " - Đến lúc: " + p.getArrivalTime());
        }
    }
}