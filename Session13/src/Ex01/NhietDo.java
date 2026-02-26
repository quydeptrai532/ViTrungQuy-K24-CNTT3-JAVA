package Ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class NhietDo {
    public static void main(String[] args) {
        ArrayList<Double> nhietDo = new ArrayList<Double>();
        nhietDo.add(36.5);
        nhietDo.add(40.2);
        nhietDo.add(37.0);
        nhietDo.add(12.5);
        nhietDo.add(39.8);
        nhietDo.add(99.9);
        nhietDo.add(36.8);
        System.out.println("Danh sách ban đầu: " + nhietDo);
        double sum = 0;
        for (Double temp : nhietDo) {
            sum += temp;
        }
        double avg = sum / nhietDo.size();
        System.out.println("Trung bình trước khi lọc: " + avg);
        Iterator<Double> nhietDoMoi = nhietDo.iterator();
        while (nhietDoMoi.hasNext()) {
            Double temp = nhietDoMoi.next();
            if (temp < 34.0 || temp > 42.0) {
                nhietDoMoi.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + nhietDo);

        sum = 0;
        for (Double temp : nhietDo) {
            sum += temp;
        }
        avg = sum / nhietDo.size();
        System.out.println("Trung bình sau khi lọc: " + avg);
    }
}