public class Ex03 {
    public static class Product{
        private String maSP;
        private String tenSp;
        private double giaBan;

        public Product(String maSP, String tenSp, double giaBan) {
            this.maSP = maSP;
            this.tenSp = tenSp;
            this.giaBan = giaBan;
        }

        public void setMaSP(String maSP) {
            this.maSP = maSP;
        }

        public void setTenSp(String tenSp) {
            this.tenSp = tenSp;
        }

        public void setGiaBan(double giaBan) {
            if(giaBan<0){
                System.out.println("Gia khong hop le");
            }
            else {
                this.giaBan = giaBan;
                System.out.println("Thay doi gia ban thanh cong");
            }

        }
    }
    public static void main(String[] args) {
       Product pro1=new Product("Pr001","Quan xi lip",125.500);
       pro1.setGiaBan(-123);
       pro1.setGiaBan(123.000);
    }
}
