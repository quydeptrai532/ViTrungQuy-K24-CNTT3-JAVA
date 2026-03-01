package btth;

import java.util.Scanner;

public class HoSoQuanLy {

    public static void main(String[] args) {

        PatientService service = new PatientService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= QUẢN LÝ PHÒNG KHÁM =========");
            System.out.println("1. Thêm bệnh nhân");
            System.out.println("2. Hiển thị bệnh nhân");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("SĐT: ");
                    String phone = sc.nextLine();
                    service.add(new Patient(id, name, age, phone));
                    break;

                case 2:
                    service.displayAll();
                    break;

                case 3:
                    service.sortByAge();
                    break;

                case 0:
                    System.out.println("Thoát chương trình...");
                    return;
            }
        }
    }
}