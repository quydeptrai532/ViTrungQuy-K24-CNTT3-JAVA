public class BTTH {

    static class Employee {
        protected String name;
        protected double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        double getSalary() {
            return baseSalary;
        }

        double getSalary(int bonus) {
            return baseSalary + bonus;
        }
    }

    static class Manager extends Employee {

        public Manager(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        double getSalary() {
            return super.getSalary() + 5_000_000;
        }
    }

    static class Developer extends Employee {

        public Developer(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        double getSalary() {
            return super.getSalary() + 2_000_000;
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Manager("Nguyen Van A", 10_000_000);
        Employee e2 = new Developer("Tran Thi B", 8_000_000);

        System.out.println(e1.name + " - Lương: " + e1.getSalary());
        System.out.println(e2.name + " - Lương: " + e2.getSalary());

        System.out.println(e1.name + " - Lương + thưởng: " + e1.getSalary(2_000_000));
    }
}
