package ex03;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack = new Stack<>();

    // Kiểm tra quy trình
    public boolean checkProcess(String[] actions) {

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("Medication");
                System.out.println("Step " + (i + 1) + ": PUSH -> Phat thuoc");

            } else if (action.equalsIgnoreCase("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Step " + (i + 1) + ": POP -> Loi! Khong the POP khi Stack dang rong.");
                    return false;
                }

                stack.pop();
                System.out.println("Step " + (i + 1) + ": POP -> Hoan tat phat thuoc");

            } else {
                System.out.println("Step " + (i + 1) + ": Hanh dong khong hop le!");
                return false;
            }
        }

        // Kiểm tra cuối ca trực
        if (!stack.isEmpty()) {
            System.out.println("Ket thuc ca truc: Loi! Van con thuoc chua hoan tat (Stack chua rong).");
            return false;
        }

        System.out.println("Ket thuc ca truc: Quy trinh hop le.");
        return true;
    }

    // Reset Stack
    public void reset() {
        stack.clear();
    }
}