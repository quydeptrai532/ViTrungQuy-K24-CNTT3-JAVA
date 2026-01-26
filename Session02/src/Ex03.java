import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,total;
        total=0;
        System.out.println("Nhap so luong sach muon");
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
           System.out.printf("Nhap so ngay tre cua cuon sach thu %d: %n",i);
           m=sc.nextInt();
           total+=m*5000;
        }
        System.out.println("Tong tien phat la "+total);
        sc.close();
    }
}
