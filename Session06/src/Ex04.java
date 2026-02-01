public class Ex04 {
    public static class Employee{
        private String eId;
        private String eName;
        private double eMoney;

        public Employee(String eId, String eName, double eMoney) {
            this.eId = eId;
            this.eName = eName;
            this.eMoney = eMoney;
        }

        public Employee(String eId, String eName) {
            this.eId = eId;
            this.eName = eName;
        }
        public Employee(){
            this.eId="123";
            this.eName="Quydz";
            this.eMoney=100000;
        }
        void printInfo(){
            System.out.println("Ten:"+this.eName+"MaNV:"+this.eId+"Luong:"+this.eMoney);
        }
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("NV01","Quydz1");
        Employee e3=new Employee("NV02","Quydz2",1000000.000);
        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }
}
