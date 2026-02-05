public class Ex05 {

    static abstract class Employee {
        protected String name;

        public Employee(String name) {
            this.name = name;
        }

        public abstract double calculateSalary();
    }

    static class OfficeEmployee extends Employee {
        private double baseSalary;

        public OfficeEmployee(String name, double baseSalary) {
            super(name);
            this.baseSalary = baseSalary;
        }

        @Override
        public double calculateSalary() {
            return baseSalary;
        }
    }

    static class ProductionEmployee extends Employee {
        private int numOfProducts;
        private double price;

        public ProductionEmployee(String name, int numOfProducts, double price) {
            super(name);
            this.numOfProducts = numOfProducts;
            this.price = price;
        }

        @Override
        public double calculateSalary() {
            return numOfProducts * price;
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("Nguyen Van A", 10_000_000);
        employees[1] = new ProductionEmployee("Tran Thi B", 300, 20_000);
        employees[2] = new ProductionEmployee("Le Van C", 150, 30_000);

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            double salary = e.calculateSalary();
            totalSalary += salary;

            System.out.println((i + 1) + ". " + e.name + " - Lương: " + (long) salary);
        }

        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + (long) totalSalary);
    }
}
