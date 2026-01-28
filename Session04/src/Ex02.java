import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String decripton;
        System.out.println("Moi ban nhap vao mo ta cho cuon sach");
        decripton=sc.nextLine();
        if(decripton.contains("Kệ")){
            int pos=decripton.indexOf("Kệ");
            if(pos!=-1){
                int start=pos+3;
                int end=decripton.indexOf(",",start);
                String maKe;
                if(end!=-1){
                    maKe=decripton.substring(start,end).trim();
                    System.out.println("Vi Tri Tim Thay"+maKe);
                    decripton=decripton.replaceAll("Kệ","Vị Trí Lưu Trữ");
                    System.out.println("Mô tả mới:"+decripton);
                }
                else {
                    maKe=decripton.substring(start).trim();
                    System.out.println("Vi Tri Tim Thay"+maKe);
                    decripton=decripton.replaceAll("Kệ","Vị Trí Lưu Trữ");
                    System.out.println("Mo ta moi:"+decripton);
                }
            }


        } else {
            System.out.println("Khong tim thay Ke trong mo ta");
        }
        sc.close();
    }
}
