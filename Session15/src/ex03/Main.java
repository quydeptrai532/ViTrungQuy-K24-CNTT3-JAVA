package ex03;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        // Ví dụ 1: Hợp lệ
        System.out.println("=== Kiem tra quy trinh 1 ===");
        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(process1);

        checker.reset();

        // Ví dụ 2: POP khi rỗng
        System.out.println("\n=== Kiem tra quy trinh 2 ===");
        String[] process2 = {"PUSH", "POP", "POP"};
        checker.checkProcess(process2);

        checker.reset();

        // Ví dụ 3: Kết thúc nhưng Stack chưa rỗng
        System.out.println("\n=== Kiem tra quy trinh 3 ===");
        String[] process3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(process3);
    }
}