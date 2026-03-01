package Ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuanLyMaThuoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> map=new HashMap<>();
        map.put("T01", "Paracetamol");
        map.put("T02", "Amoxicillin");
        map.put("T03", "Ibuprofen");
        map.put("T04", "Aspirin");
        map.put("T05", "Vitamin C");
        map.put("T06", "Cetirizine");
        String maThuoc;
        System.out.println("Moi ban nhap vao ma thuoc can tim");
        maThuoc=sc.nextLine();
        if(map.containsKey(maThuoc)){
            System.out.println(map.get(maThuoc));
        }
        else System.out.println("Khong ton tai ma thuoc");
    }
}
