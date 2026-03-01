package btth;

import java.util.*;

public class PatientService implements Manageable<Patient> {

    private Set<Patient> patients = new HashSet<>();
    private Map<String, List<MedicalRecord>> recordMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void add(Patient p) {
        if (patients.add(p)) {
            System.out.println("Thêm thành công!");
        } else {
            System.out.println("ID đã tồn tại!");
        }
    }

    @Override
    public void update(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();
                System.out.print("Nhập tuổi mới: ");
                int newAge = Integer.parseInt(sc.nextLine());
                p.name = newName;
                p.age = newAge;
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân!");
    }

    @Override
    public void delete(String id) {
        patients.removeIf(p -> p.getId().equals(id));
        recordMap.remove(id);
        System.out.println("Đã xóa!");
    }

    @Override
    public void displayAll() {
        patients.forEach(Patient::displayInfo);
    }

    // ===== MAP =====
    public void addRecord(String patientId, MedicalRecord record) {
        recordMap.computeIfAbsent(patientId, k -> new ArrayList<>()).add(record);
    }

    public void viewRecords(String patientId) {
        List<MedicalRecord> list = recordMap.get(patientId);
        if (list == null) {
            System.out.println("Không có hồ sơ.");
            return;
        }
        list.forEach(System.out::println);
    }

    // ===== SORT =====
    public void sortByAge() {
        List<Patient> list = new ArrayList<>(patients);
        list.sort(Comparator.comparingInt(Patient::getAge));
        list.forEach(Patient::displayInfo);
    }

    public void sortById() {
        List<Patient> list = new ArrayList<>(patients);
        list.sort(Comparator.comparing(Patient::getId));
        list.forEach(Patient::displayInfo);
    }
}