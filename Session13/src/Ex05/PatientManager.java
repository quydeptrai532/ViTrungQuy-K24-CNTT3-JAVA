package Ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiep nhan benh nhan");
            System.out.println("2. Cap nhat chan doan");
            System.out.println("3. Xuat vien");
            System.out.println("4. Sap xep danh sach theo tuoi");
            System.out.println("5. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhap ID: ");
                    String id = sc.nextLine();

                    boolean isDuplicate = false;
                    for (Patient p : list) {
                        if (p.getId().equalsIgnoreCase(id)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (isDuplicate) {
                        System.out.println("ID bi trung!");
                    } else {
                        System.out.print("Nhap ten: ");
                        String name = sc.nextLine();

                        System.out.print("Nhap tuoi: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Nhap chan doan: ");
                        String diagnosis = sc.nextLine();

                        list.add(new Patient(id, name, age, diagnosis));
                        System.out.println("Them thanh cong!");
                    }
                    break;

                case 2:
                    System.out.print("Nhap ID can cap nhat: ");
                    String updateId = sc.nextLine();
                    boolean found = false;

                    for (Patient p : list) {
                        if (p.getId().equalsIgnoreCase(updateId)) {
                            System.out.print("Nhap chan doan moi: ");
                            String newDiagnosis = sc.nextLine();
                            p.setDiagnosis(newDiagnosis);
                            System.out.println("Cap nhat thanh cong!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong tim thay benh nhan!");
                    }
                    break;

                case 3:
                    System.out.print("Nhap ID can xuat vien: ");
                    String removeId = sc.nextLine();

                    boolean removed = list.removeIf(p ->
                            p.getId().equalsIgnoreCase(removeId));

                    if (removed) {
                        System.out.println("Da xuat vien!");
                    } else {
                        System.out.println("Khong tim thay benh nhan!");
                    }
                    break;

                case 4:
                    list.sort((p1, p2) -> p1.getAge() - p2.getAge());
                    System.out.println("Da sap xep theo tuoi!");
                    break;

                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (Patient p : list) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }
}