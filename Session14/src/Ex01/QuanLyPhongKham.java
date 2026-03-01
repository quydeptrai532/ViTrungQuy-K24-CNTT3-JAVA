package Ex01;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class QuanLyPhongKham {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> set=new LinkedHashSet<>();
        System.out.println("Nhap ten benh nhan (nhap 1 de dung lai)");
        String name="";
        while (true){
            name=sc.nextLine();
            if(name.equals("1"))break;
            set.add(name);
        }
        for( String e:set){
            System.out.println(e);
        }
    }
}
