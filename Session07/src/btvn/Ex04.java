package btvn;

public class Ex04 {

    static class Classroom {
        private String studentName;
        private static double classFund = 0;

        public Classroom(String studentName) {
            this.studentName = studentName;
        }

        void insertClassFund(double money) {
            if (money <= 0) {
                System.out.println("So tien nhap vao khong hop le");
            } else {
                classFund += money;
            }
        }

        void checkClassFund() {
            System.out.println("Tong quy lop: " + classFund);
        }
    }

    public static void main(String[] args) {

        Classroom sv01 = new Classroom("Quy");
        Classroom sv02 = new Classroom("Huy");
        Classroom sv03 = new Classroom("Thanh");

        sv01.insertClassFund(100);
        sv01.checkClassFund();
        sv02.insertClassFund(200);
        sv02.checkClassFund();
        sv03.insertClassFund(150);
        sv03.checkClassFund();
    }
}
