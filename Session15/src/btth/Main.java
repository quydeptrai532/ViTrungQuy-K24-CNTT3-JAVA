package btth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientManagement manager = new PatientManagement();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Dang ky kham");
            System.out.println("2. Goi kham");
            System.out.println("3. Xem hang doi");
            System.out.println("4. Tim kiem");
            System.out.println("5. Sap xep theo tuoi");
            System.out.println("6. Xem lich su dieu tri");
            System.out.println("0. Thoat");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Cap cuu? (y/n): ");
                    String type = sc.nextLine();

                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Ten: ");
                    String name = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tinh trang: ");
                    String condition = sc.nextLine();

                    if (type.equalsIgnoreCase("y")) {
                        manager.add(new EmergencyPatient(id, name, age, condition, 1));
                    } else {
                        manager.add(new Patient(id, name, age, condition));
                    }
                    break;

                case 2:
                    Patient p = manager.callPatient();
                    if (p == null) {
                        System.out.println("Khong co benh nhan.");
                    } else {
                        System.out.println("Dang kham:");
                        p.showInfo();

                        System.out.print("Nhap chan doan: ");
                        String record = sc.nextLine();
                        p.addHistory(record);
                    }
                    break;

                case 3:
                    manager.display();
                    break;

                case 4:
                    System.out.print("Nhap ID hoac Ten: ");
                    String key = sc.nextLine();
                    Patient found = manager.search(key);
                    if (found != null)
                        found.showInfo();
                    else
                        System.out.println("Khong tim thay.");
                    break;

                case 5:
                    manager.sort();
                    break;

                case 6:
                    System.out.print("Nhap ID: ");
                    String idSearch = sc.nextLine();
                    Patient patient = manager.search(idSearch);
                    if (patient != null)
                        patient.showHistory();
                    else
                        System.out.println("Khong tim thay.");
                    break;
            }

        } while (choice != 0);
    }
}