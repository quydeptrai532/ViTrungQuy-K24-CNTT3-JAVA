package Ex05;
import java.util.Scanner;
import java.util.ArrayList;
public class Patient {
    String id;
    String fullname;
    int age;
    String diagnosis;

    public Patient(String id, String fullname, int age, String diagnosis) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Patient> list=new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiep nhan benh nhan");
            System.out.println("2. Cap nhat chan doan");
            System.out.println("3. Xuat vien");
            System.out.println("4. Sap xep danh sach");
            System.out.println("5. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Moi ban nhap id benh nhan");
                    String id= sc.nextLine();
                    boolean isDupicate=false;
                    for (Patient p:list){
                        if(p.id.e)
                    }
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (choice != 0);
    }
    }
