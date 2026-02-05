public class Ex03 {
    static class Employee{
        protected String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
    static class Manager extends Employee {
        private String department;

        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        void displayInfo(){
            System.out.println("Ten:"+name +"Luong:"+salary +"Phong ban:"+department);
        }
    }
}
