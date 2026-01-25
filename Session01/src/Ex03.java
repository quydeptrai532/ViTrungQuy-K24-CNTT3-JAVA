public class Ex03 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.println("Truoc khi doi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        // book1, book2 la bien tham chieu nam tren stack
        // cac chuoi nam tren heap, stack chi giu dia chi tro toi chuoi
        // khi gan temp = book1 thi temp chi tro toi cung chuoi, khong tao chuoi moi
        String temp = book1;
        book1 = book2;
        book2 = temp;
        // luc nay chi la doi dia chi giua cac bien tren stack
        // du lieu tren heap khong bi thay doi
        // String la immutable nen khong sua truc tiep noi dung
        System.out.println("\nSau khi doi:");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}
