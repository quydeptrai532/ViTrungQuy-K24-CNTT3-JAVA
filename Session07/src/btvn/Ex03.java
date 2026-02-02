package btvn;

public class Ex03 {

    static class ScoreUtils {

        private ScoreUtils() {}

        static boolean checkPass(double score) {
            return score >= 5.0;
        }
        static double calculateAverage(double[] scores) {
            if (scores == null || scores.length == 0) {
                return 0;
            }
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            return sum / scores.length;
        }
    }
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println("Diem trung binh: " + avg);
        for (double score : scores) {
            System.out.println(
                    score + " -> " + (ScoreUtils.checkPass(score) ? "Dat" : "Truot")
            );
        }
    }
}
