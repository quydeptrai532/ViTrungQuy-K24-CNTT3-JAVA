package Ex05;

public class Main {

    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyen Van A", 8000);
        Employee manager = new Manager("Tran Van B", 15000, 5000);

        printSalary(staff);
        printSalary(manager);
    }

    public static void printSalary(Employee emp) {

        System.out.println("Nhân viên: " + emp.getName());
        System.out.println("Lương cơ bản: " + emp.baseSalary);

        if (emp instanceof BonusCalculator) {
            BonusCalculator b = (BonusCalculator) emp;
            System.out.println("Thưởng KPI: " + b.getBonus());
        } else {
            System.out.println("Thưởng KPI: Không có");
        }

        System.out.println("Tổng lương: " + emp.calculateSalary());
        System.out.println("-------------------------");
    }
}