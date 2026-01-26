import  java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idBook;
        do {
            System.out.println("Moi ban nhap vao id cua sach");
            idBook = sc.nextInt();
            if (idBook > 0)
                System.out.println("Id" + idBook + "hop le");

            else System.out.println("Nhap sai vui long nhap lai ma sach phai >0");
        }
        while (idBook <= 0);
        sc.close();
    }
}


