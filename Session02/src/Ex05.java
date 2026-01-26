import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reputation=100;
        int code;
        while (true){
            System.out.println("Nhap so ngay cua tung lan tra sach nay:");
            code=sc.nextInt();
            if(code ==999){
                break;
            }
            if(code<=0) {
                reputation += 5;
                System.out.println("Tra sach dung han: + 5 diem ");
            }
            else{
                reputation-=code*2;
                System.out.println("Tra sach tre" + code +"ngay:"+ code*2*-1 + "diem" );
            }
        }
        System.out.println("Tong diem uy tin:"+ reputation);
        String a;
        if(reputation > 120){
            a="Doc gia than thiet";
        }
        else  if ( reputation >=80){
            a="Doc gia tieu chuan";
        }
        else {
            a="Doc gia can luu y";
        }
        System.out.printf("Xep loai:%s %n",a);
        sc.close();
    }
}
