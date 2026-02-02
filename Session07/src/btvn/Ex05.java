package btvn;

public class Ex05 {

    static class Config {
        static final double MAX_SCORE = 10.0;
        static final double MIN_SCORE = 0.0;
    }

    public static void main(String[] args) {
        double score = 8.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Diem hop le: " + score);
        } else {
            System.out.println("Diem khong hop le");
        }
        // Config.MAX_SCORE=11;
        //Bị lỗi Cannot assign a value to final variable 'MAX_SCORE'
    }
}
