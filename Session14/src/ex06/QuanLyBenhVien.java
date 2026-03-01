package ex06;

import java.util.*;

public class QuanLyBenhVien {

    public static void main(String[] args) {

        // Danh sách ban đầu
        List<Patient> danhSachBenhNhan = new ArrayList<>();

        danhSachBenhNhan.add(new Patient("Lan", 30, "Tim mạch"));
        danhSachBenhNhan.add(new Patient("Hùng", 40, "Nội tiết"));
        danhSachBenhNhan.add(new Patient("Mai", 25, "Tim mạch"));

        // Map gom nhóm theo khoa
        Map<String, List<Patient>> banDoKhoa = new HashMap<>();

        //  Gom nhóm bệnh nhân vào từng khoa
        for (Patient bn : danhSachBenhNhan) {

            String tenKhoa = bn.getDepartment();

            if (!banDoKhoa.containsKey(tenKhoa)) {
                banDoKhoa.put(tenKhoa, new ArrayList<>());
            }

            banDoKhoa.get(tenKhoa).add(bn);
        }

        // In cấu trúc Map
        System.out.println("===== DANH SÁCH BỆNH NHÂN THEO KHOA =====");
        for (String khoa : banDoKhoa.keySet()) {
            System.out.println("Khoa " + khoa + " -> " + banDoKhoa.get(khoa));
        }

        //  Hiển thị bệnh nhân của một khoa bất kỳ
        String khoaCanXem = "Tim mạch";
        System.out.println("\nBệnh nhân khoa " + khoaCanXem + ":");
        System.out.println(banDoKhoa.get(khoaCanXem));

        //  Tìm khoa đông nhất
        String khoaDongNhat = "";
        int soLuongMax = 0;

        for (String khoa : banDoKhoa.keySet()) {
            int soLuong = banDoKhoa.get(khoa).size();

            if (soLuong > soLuongMax) {
                soLuongMax = soLuong;
                khoaDongNhat = khoa;
            }
        }

        System.out.println("\nKhoa " + khoaDongNhat +
                " đang đông nhất (" + soLuongMax + " bệnh nhân)");
    }
}