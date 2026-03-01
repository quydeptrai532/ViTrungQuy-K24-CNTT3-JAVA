package Ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DanhSachBenhNhan {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Cúm A");
        list.add("Sốt xuất huyết");
        list.add("Cúm A");
        list.add("Covid-19");
        list.add("Cúm A");
        list.add("Sốt xuất huyết");

        Map<String, Integer> map = new TreeMap<>();

        for (String e : list) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }
        map.forEach((key,value)->{
            System.out.println(key+":"+value+" ca");
        });
    }
}