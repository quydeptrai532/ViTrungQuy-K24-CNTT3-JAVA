package Ex02;

import java.util.ArrayList;
import java.util.Collections;

public class KiemTraThuoc {
    public static void main(String[] args) {
        ArrayList<String> thuoc=new ArrayList<>();
        thuoc.add("Paracetamol");
        thuoc.add("Ibuprofen");
        thuoc.add("Panadol");
        thuoc.add("Paracetamol");
        thuoc.add("Aspirin");
        thuoc.add("Ibuprofen");
        System.out.println("Trước khi lọc: " + thuoc);
        ArrayList<String> thuocUnique=new ArrayList<>();
        for (String t:thuoc){
            if(!thuocUnique.contains(t)){
                thuocUnique.add(t);
            }
        }
        Collections.sort(thuocUnique);
        System.out.println("Sau khi lọc & sắp xếp: " + thuocUnique);
    }
}
