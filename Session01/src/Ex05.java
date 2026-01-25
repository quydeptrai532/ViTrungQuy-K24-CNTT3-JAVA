import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen 4 chu so: ");
        int n = sc.nextInt();
        int thousands = n / 1000;
        int hundreds  = (n / 100) % 10;
        int dozens    = (n / 10) % 10;
        int units     = n % 10;
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        boolean isValid = (sumOfFirstThreeNumber % 10) == units;
        System.out.println("Ma hop le: " + isValid);
        sc.close();
    }
}
