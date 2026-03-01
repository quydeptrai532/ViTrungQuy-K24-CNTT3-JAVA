package Ex03;

import java.util.HashSet;
import java.util.Set;
public class PhanTichDiUng {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        set1.add("Aspirin");
        set1.add("Caffeine");
        set1.add("Paracetamol");

        Set<String> set2=new HashSet<>();
        set2.add("Penicillin");
        set2.add("Aspirin");
        set2.add("Pollen");
        Set<String> diUng=new HashSet<>(set1);
        Set<String> anToan=new HashSet<>(set1);
        diUng.retainAll(set2);
        if(diUng.isEmpty()){
            System.out.println("Khong co thanh phan di ung");
            System.out.println("Thanh phan an toan:"+anToan);
        }
        else {
            System.out.println("Canh bao di dung:"+diUng);
            anToan.removeAll(set2);
            System.out.println("Thanh phan an toan:"+anToan);
        }
}
}
