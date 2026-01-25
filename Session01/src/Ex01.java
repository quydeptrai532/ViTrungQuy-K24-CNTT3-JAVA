import  java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bookId;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;
        System.out.println("nhap id sach:");
        bookId=sc.nextLine();
        System.out.println("nhap ten sach:");
        bookName=sc.nextLine();
        System.out.println("Nhap ngay xuat ban:");
        publishYear=sc.nextInt();
        System.out.println("Nhap gia ban:");
        price=sc.nextDouble();
        System.out.println("Sach co hop le khong:");
        isAvailable=sc.nextBoolean();
        int ageBook=2026-publishYear;
        System.out.println("--- Phieu Thong Tin Sach");
        System.out.printf("Ten Sach:%s%n",bookName);
        System.out.printf("Ma so:%s | Tuoi tho %d%n",bookId,ageBook);
        System.out.printf("Gia ban :%.2f VND %n",price);
        System.out.printf("Tinh trang sach %s%n",isAvailable ? "Con Ban":"Het Hang");
        sc.close();
    }
}
