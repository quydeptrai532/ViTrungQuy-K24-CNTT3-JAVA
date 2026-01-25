import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu tu sach: ");
        int stt = sc.nextInt();
        int ke = (stt - 1) / 25 + 1;
        int viTri = (stt - 1) % 25 + 1;
        String khuVuc = (ke <= 10) ? "Khu Can" : "Khu Vien";
        System.out.println(
                "Ke so " + ke + " - Vi tri " + viTri + " - Khu vuc " + khuVuc
        );
        sc.close();
    }
}
