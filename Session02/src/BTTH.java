import java.util.Scanner;
public class BTTH {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,m;
        double total=0;
        System.out.println("Nhap so luong sach doc gia tra:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap ngay tra cua quyen sach thu:" + i);
            m=sc.nextInt();
            if(m<=5) total+=m*2000;
            else total+=5*2000+(m-5)*5000;
        }
        System.out.println("Tong tien phat cua doc gia la:"+ total);
        int age,bookRent,studentCard;
        age=sc.nextInt();
        bookRent=sc.nextInt();
        studentCard=sc.nextInt();
        if(age>=18 && bookRent>=10 || studentCard==1){
            System.out.println("Du dieu kien nang cap vip");
        }
        else System.out.println("Khong du dieu kien");

        int idBook,countBook=0;
        do {
            System.out.println("Nhap ma cua sach nhap kho");
            idBook=sc.nextInt();
            if (idBook==0){
                break;
            }
            if (idBook<0){
                continue;
            }
            countBook++;
        }
        while ( true);
        System.out.println("Tong so sach hop le da nhap: " + countBook);
        sc.close();
    }

}
