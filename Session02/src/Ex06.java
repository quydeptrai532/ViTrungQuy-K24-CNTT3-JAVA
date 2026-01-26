import  java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,sum=0,max=0,min=0,n;
        for (int i=2;i<=8;i++){
            if (i==8){
                System.out.println("Nhap luot muon ngay chua nhat:");
            }
            else {
                System.out.println("Nhap luot muon ngay thu:" + i);
            }
            n=sc.nextInt();
            if(n==0) continue;
            if (count == 0) {
                max = min = n;
            } else {
                if (n > max) max = n;
                if (n < min) min = n;
            }
            sum+=n;
            count++;
        }
        System.out.println("--- Ket Qua Thong Ke ---");
        System.out.println("Luot muon cao nhat :"+max);
        System.out.println("Luot muon thap nhat:" +min);
        System.out.println("Trung binh luot muon/ngay:" + sum/count);
    }
}
