import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, bookQuantity;
        System.out.println("Nhap so tuoi cua ban:");
        age = sc.nextInt();
        System.out.println("Nhap so sach dang giu:");
        bookQuantity = sc.nextInt();
        if (age >= 18 && bookQuantity < 3) {
            System.out.println("Cho phep muon sach");
        } else if (age < 18) {
            System.out.println("Ban ko du tuoi de muon sach");
        } else {
            System.out.println("Ban da muon qua so luong cho phep");
        }
        sc.close();
    }
}
